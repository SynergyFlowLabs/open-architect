package org.locationtech.jts.io.gml2;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.r;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes14.dex */
public class c {
    public n a(Reader reader, r rVar) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
        sAXParserFactoryNewInstance.setNamespaceAware(false);
        sAXParserFactoryNewInstance.setValidating(false);
        SAXParser sAXParserNewSAXParser = sAXParserFactoryNewInstance.newSAXParser();
        if (rVar == null) {
            rVar = new r();
        }
        b bVar = new b(rVar, null);
        sAXParserNewSAXParser.parse(new InputSource(reader), bVar);
        return bVar.b();
    }

    public n b(String str, r rVar) throws ParserConfigurationException, SAXException, IOException {
        return a(new StringReader(str), rVar);
    }
}
