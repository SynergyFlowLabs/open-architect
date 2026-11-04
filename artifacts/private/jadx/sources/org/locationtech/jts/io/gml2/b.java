package org.locationtech.jts.io.gml2;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.r;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.ErrorHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: loaded from: classes14.dex */
public class b extends DefaultHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Stack f338506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ErrorHandler f338507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private r f338508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Locator f338509d;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected Attributes f338510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected e.n f338511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected StringBuffer f338512c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected List f338513d = null;

        public a(e.n nVar, Attributes attributes) {
            this.f338510a = null;
            if (attributes != null) {
                this.f338510a = new AttributesImpl(attributes);
            }
            this.f338511b = nVar;
        }

        public void a(String str) {
            if (this.f338512c == null) {
                this.f338512c = new StringBuffer();
            }
            this.f338512c.append(str);
        }

        public Object b(r rVar) throws SAXException {
            return this.f338511b.a(this, rVar);
        }

        public void c(Object obj) {
            if (this.f338513d == null) {
                this.f338513d = new LinkedList();
            }
            this.f338513d.add(obj);
        }
    }

    public b(r rVar, ErrorHandler errorHandler) {
        Stack stack = new Stack();
        this.f338506a = stack;
        this.f338509d = null;
        this.f338507b = errorHandler;
        this.f338508c = rVar;
        stack.push(new a(null, null));
    }

    protected Locator a() {
        return this.f338509d;
    }

    public n b() {
        if (this.f338506a.size() == 1) {
            a aVar = (a) this.f338506a.peek();
            return aVar.f338513d.size() == 1 ? (n) aVar.f338513d.get(0) : this.f338508c.e((n[]) aVar.f338513d.toArray(new n[this.f338506a.size()]));
        }
        throw new IllegalStateException("Parse did not complete as expected, there are " + this.f338506a.size() + " elements on the Stack");
    }

    public boolean c() {
        return this.f338506a.size() <= 1 && ((a) this.f338506a.peek()).f338513d.size() >= 1;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i10, int i11) throws SAXException {
        if (this.f338506a.isEmpty()) {
            return;
        }
        ((a) this.f338506a.peek()).a(new String(cArr, i10, i11));
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
        ((a) this.f338506a.peek()).c(((a) this.f338506a.pop()).b(this.f338508c));
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
    public void error(SAXParseException sAXParseException) throws SAXException {
        ErrorHandler errorHandler = this.f338507b;
        if (errorHandler != null) {
            errorHandler.error(sAXParseException);
        } else {
            super.error(sAXParseException);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
    public void fatalError(SAXParseException sAXParseException) throws SAXException {
        ErrorHandler errorHandler = this.f338507b;
        if (errorHandler != null) {
            errorHandler.fatalError(sAXParseException);
        } else {
            super.fatalError(sAXParseException);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i10, int i11) throws SAXException {
        if (this.f338506a.isEmpty()) {
            return;
        }
        ((a) this.f338506a.peek()).a(" ");
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator) {
        this.f338509d = locator;
        ErrorHandler errorHandler = this.f338507b;
        if (errorHandler == null || !(errorHandler instanceof ContentHandler)) {
            return;
        }
        ((ContentHandler) errorHandler).setDocumentLocator(locator);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        e.n nVarA = e.a(str, str2);
        if (nVarA == null) {
            int i10 = 2 & 0;
            nVarA = e.a(null, str3.substring(str3.indexOf(58) + 1, str3.length()));
        }
        this.f338506a.push(new a(nVarA, attributes));
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
    public void warning(SAXParseException sAXParseException) throws SAXException {
        ErrorHandler errorHandler = this.f338507b;
        if (errorHandler != null) {
            errorHandler.warning(sAXParseException);
        } else {
            super.warning(sAXParseException);
        }
    }
}
