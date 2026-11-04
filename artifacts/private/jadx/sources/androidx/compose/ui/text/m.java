package androidx.compose.ui.text;

import android.text.Editable;
import java.util.ArrayList;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nHtml.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Html.android.kt\nandroidx/compose/ui/text/AnnotationContentHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,378:1\n1#2:379\n3829#3:380\n4344#3,2:381\n35#4,5:383\n*S KotlinDebug\n*F\n+ 1 Html.android.kt\nandroidx/compose/ui/text/AnnotationContentHandler\n*L\n308#1:380\n308#1:381,2\n309#1:383,5\n*E\n"})
final class m implements ContentHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ContentHandler f41987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Editable f41988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private q f41990d;

    public m(@NotNull ContentHandler contentHandler, @NotNull Editable editable) {
        this.f41987a = contentHandler;
        this.f41988b = editable;
    }

    private final void a() {
        q qVar = this.f41990d;
        if (qVar != null) {
            this.f41988b.setSpan(qVar, qVar.h(), this.f41988b.length(), 33);
        }
        this.f41990d = null;
    }

    private final void b() {
        Editable editable = this.f41988b;
        Object[] spans = editable.getSpans(0, editable.length(), n.class);
        ArrayList arrayList = new ArrayList();
        for (Object obj : spans) {
            if (this.f41988b.getSpanFlags((n) obj) == 17) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) arrayList.get(i10);
            int spanStart = this.f41988b.getSpanStart(nVar);
            int length = this.f41988b.length();
            this.f41988b.removeSpan(nVar);
            if (spanStart != length) {
                this.f41988b.setSpan(nVar, spanStart, length, 33);
            }
        }
    }

    private final void c(Attributes attributes) {
        int length = attributes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            String localName = attributes.getLocalName(i10);
            if (localName == null) {
                localName = "";
            }
            String value = attributes.getValue(i10);
            String str = value != null ? value : "";
            if (localName.length() > 0 && str.length() > 0) {
                int length2 = this.f41988b.length();
                this.f41988b.setSpan(new n(localName, str), length2, length2, 17);
            }
        }
    }

    private final void d() {
        a();
    }

    private final void e() {
        a();
        this.f41990d = new q(p.f42031h.a(), this.f41989c, this.f41988b.length());
    }

    private final void f() {
        a();
        this.f41989c--;
    }

    private final void g() {
        a();
        this.f41989c++;
    }

    @Override // org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i10, int i11) throws SAXException {
        this.f41987a.characters(cArr, i10, i11);
    }

    @Override // org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
        this.f41987a.endDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public void endElement(@Nullable String str, @Nullable String str2, @Nullable String str3) throws SAXException {
        if (str2 != null) {
            int iHashCode = str2.hashCode();
            if (iHashCode != -1555043537) {
                if (iHashCode != 3453) {
                    if (iHashCode == 3735 && str2.equals("ul")) {
                        f();
                        return;
                    }
                } else if (str2.equals("li")) {
                    d();
                    return;
                }
            } else if (str2.equals("annotation")) {
                b();
                return;
            }
        }
        this.f41987a.endElement(str, str2, str3);
    }

    @Override // org.xml.sax.ContentHandler
    public void endPrefixMapping(String str) throws SAXException {
        this.f41987a.endPrefixMapping(str);
    }

    @Override // org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i10, int i11) throws SAXException {
        this.f41987a.ignorableWhitespace(cArr, i10, i11);
    }

    @Override // org.xml.sax.ContentHandler
    public void processingInstruction(String str, String str2) throws SAXException {
        this.f41987a.processingInstruction(str, str2);
    }

    @Override // org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator) {
        this.f41987a.setDocumentLocator(locator);
    }

    @Override // org.xml.sax.ContentHandler
    public void skippedEntity(String str) throws SAXException {
        this.f41987a.skippedEntity(str);
    }

    @Override // org.xml.sax.ContentHandler
    public void startDocument() throws SAXException {
        this.f41987a.startDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public void startElement(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Attributes attributes) throws SAXException {
        if (str2 != null) {
            int iHashCode = str2.hashCode();
            if (iHashCode != -1555043537) {
                if (iHashCode != 3453) {
                    if (iHashCode == 3735 && str2.equals("ul")) {
                        g();
                        return;
                    }
                } else if (str2.equals("li")) {
                    e();
                    return;
                }
            } else if (str2.equals("annotation")) {
                if (attributes != null) {
                    c(attributes);
                    return;
                }
                return;
            }
        }
        this.f41987a.startElement(str, str2, str3, attributes);
    }

    @Override // org.xml.sax.ContentHandler
    public void startPrefixMapping(String str, String str2) throws SAXException {
        this.f41987a.startPrefixMapping(str, str2);
    }
}
