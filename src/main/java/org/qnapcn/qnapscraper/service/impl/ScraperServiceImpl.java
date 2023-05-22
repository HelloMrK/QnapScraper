package org.qnapcn.qnapscraper.service.impl;

import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.qnapcn.qnapscraper.model.official.OfficialXmlRoot;
import org.qnapcn.qnapscraper.service.ScraperService;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.net.URL;
import javax.net.ssl.*;

@Service
public class ScraperServiceImpl implements ScraperService {
    @Override
    public OfficialXmlRoot scrapeData() {
        OfficialXmlRoot officialXmlRoot = null;
        String xmlUrl = "https://qnapclub.eu/en/repo.xml";
        Unmarshaller unmarshaller = null;

        try {
            // 创建信任所有证书的SSL上下文
            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, new TrustManager[]{new TrustAllManager()}, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());
            HttpsURLConnection.setDefaultHostnameVerifier(new NoopHostnameVerifier());

            JAXBContext jaxbContext = JAXBContext.newInstance(OfficialXmlRoot.class);
            unmarshaller = jaxbContext.createUnmarshaller();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            URL url = new URL(xmlUrl);
            officialXmlRoot = (OfficialXmlRoot) unmarshaller.unmarshal(url);
        } catch (IOException | JAXBException e) {
            e.printStackTrace();
        }

        return officialXmlRoot;
    }
    @Override
    public void saveData(OfficialXmlRoot data) {
        System.out.println(data);
    }



    // 自定义TrustManager，信任所有证书
    private static class TrustAllManager implements X509TrustManager {
        public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType) {
        }

        public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType) {
        }

        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
            return new java.security.cert.X509Certificate[]{};
        }
    }
}
