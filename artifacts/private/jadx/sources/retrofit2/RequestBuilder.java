package retrofit2;

import com.google.common.base.c;
import fj.h;
import java.io.EOFException;
import java.io.IOException;
import java.util.regex.Pattern;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.s;
import okhttp3.u;
import okhttp3.v;
import okhttp3.x;
import okhttp3.y;
import okio.m;
import org.locationtech.jts.geom.l;

/* JADX INFO: loaded from: classes14.dex */
final class RequestBuilder {
    private static final String PATH_SEGMENT_ALWAYS_ENCODE_SET = " \"<>^`{}|\\?#";
    private final v baseUrl;

    @h
    private e0 body;

    @h
    private x contentType;

    @h
    private s.a formBuilder;
    private final boolean hasBody;
    private final u.a headersBuilder;
    private final String method;

    @h
    private y.a multipartBuilder;

    @h
    private String relativeUrl;
    private final d0.a requestBuilder = new d0.a();

    @h
    private v.a urlBuilder;
    private static final char[] HEX_DIGITS = {l.f338160j, l.f338161k, l.f338162l, '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', l.f338157g};
    private static final Pattern PATH_TRAVERSAL = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    private static class ContentTypeOverridingRequestBody extends e0 {
        private final x contentType;
        private final e0 delegate;

        ContentTypeOverridingRequestBody(e0 e0Var, x xVar) {
            this.delegate = e0Var;
            this.contentType = xVar;
        }

        @Override // okhttp3.e0
        public long contentLength() throws IOException {
            return this.delegate.contentLength();
        }

        @Override // okhttp3.e0
        public x contentType() {
            return this.contentType;
        }

        @Override // okhttp3.e0
        public void writeTo(m mVar) throws IOException {
            this.delegate.writeTo(mVar);
        }
    }

    RequestBuilder(String str, v vVar, @h String str2, @h u uVar, @h x xVar, boolean z10, boolean z11, boolean z12) {
        this.method = str;
        this.baseUrl = vVar;
        this.relativeUrl = str2;
        this.contentType = xVar;
        this.hasBody = z10;
        if (uVar != null) {
            this.headersBuilder = uVar.s();
        } else {
            this.headersBuilder = new u.a();
        }
        if (z11) {
            this.formBuilder = new s.a();
        } else if (z12) {
            y.a aVar = new y.a();
            this.multipartBuilder = aVar;
            aVar.g(y.f334822k);
        }
    }

    private static String canonicalizeForPath(String str, boolean z10) throws EOFException {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt < 127 && PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(iCodePointAt) == -1 && (z10 || (iCodePointAt != 47 && iCodePointAt != 37))) {
                iCharCount += Character.charCount(iCodePointAt);
            }
            okio.l lVar = new okio.l();
            lVar.K3(str, 0, iCharCount);
            canonicalizeForPath(lVar, str, iCharCount, length, z10);
            str = lVar.O7();
        }
        return str;
    }

    void addFormField(String str, String str2, boolean z10) {
        if (z10) {
            this.formBuilder.b(str, str2);
        } else {
            this.formBuilder.a(str, str2);
        }
    }

    void addHeader(String str, String str2, boolean z10) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            if (z10) {
                this.headersBuilder.h(str, str2);
                return;
            } else {
                this.headersBuilder.b(str, str2);
                return;
            }
        }
        try {
            this.contentType = x.h(str2);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException("Malformed content type: " + str2, e10);
        }
    }

    void addHeaders(u uVar) {
        this.headersBuilder.e(uVar);
    }

    void addPart(u uVar, e0 e0Var) {
        this.multipartBuilder.c(uVar, e0Var);
    }

    void addPathParam(String str, String str2, boolean z10) {
        if (this.relativeUrl == null) {
            throw new AssertionError();
        }
        String strCanonicalizeForPath = canonicalizeForPath(str2, z10);
        String strReplace = this.relativeUrl.replace("{" + str + "}", strCanonicalizeForPath);
        if (!PATH_TRAVERSAL.matcher(strReplace).matches()) {
            this.relativeUrl = strReplace;
            return;
        }
        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
    }

    void addQueryParam(String str, @h String str2, boolean z10) {
        String str3 = this.relativeUrl;
        if (str3 != null) {
            v.a aVarI = this.baseUrl.I(str3);
            this.urlBuilder = aVarI;
            if (aVarI == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.baseUrl + ", Relative: " + this.relativeUrl);
            }
            this.relativeUrl = null;
        }
        if (z10) {
            this.urlBuilder.c(str, str2);
        } else {
            this.urlBuilder.g(str, str2);
        }
    }

    <T> void addTag(Class<T> cls, @h T t10) {
        this.requestBuilder.z(cls, t10);
    }

    d0.a get() {
        v vVarW;
        v.a aVar = this.urlBuilder;
        if (aVar != null) {
            vVarW = aVar.h();
        } else {
            vVarW = this.baseUrl.W(this.relativeUrl);
            if (vVarW == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.baseUrl + ", Relative: " + this.relativeUrl);
            }
        }
        e0 contentTypeOverridingRequestBody = this.body;
        if (contentTypeOverridingRequestBody == null) {
            s.a aVar2 = this.formBuilder;
            if (aVar2 != null) {
                contentTypeOverridingRequestBody = aVar2.c();
            } else {
                y.a aVar3 = this.multipartBuilder;
                if (aVar3 != null) {
                    contentTypeOverridingRequestBody = aVar3.f();
                } else if (this.hasBody) {
                    contentTypeOverridingRequestBody = e0.create((x) null, new byte[0]);
                }
            }
        }
        x xVar = this.contentType;
        if (xVar != null) {
            if (contentTypeOverridingRequestBody != null) {
                contentTypeOverridingRequestBody = new ContentTypeOverridingRequestBody(contentTypeOverridingRequestBody, xVar);
            } else {
                this.headersBuilder.b("Content-Type", xVar.toString());
            }
        }
        return this.requestBuilder.D(vVarW).o(this.headersBuilder.i()).p(this.method, contentTypeOverridingRequestBody);
    }

    void setBody(e0 e0Var) {
        this.body = e0Var;
    }

    void setRelativeUrl(Object obj) {
        this.relativeUrl = obj.toString();
    }

    void addPart(y.c cVar) {
        this.multipartBuilder.d(cVar);
    }

    private static void canonicalizeForPath(okio.l lVar, String str, int i10, int i11, boolean z10) throws EOFException {
        okio.l lVar2 = null;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt < 32 || iCodePointAt >= 127 || PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(iCodePointAt) != -1 || (!z10 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    if (lVar2 == null) {
                        lVar2 = new okio.l();
                    }
                    lVar2.d9(iCodePointAt);
                    while (!lVar2.y1()) {
                        byte b10 = lVar2.readByte();
                        lVar.writeByte(37);
                        char[] cArr = HEX_DIGITS;
                        lVar.writeByte(cArr[((b10 & 255) >> 4) & 15]);
                        lVar.writeByte(cArr[b10 & c.f116464q]);
                    }
                } else {
                    lVar.d9(iCodePointAt);
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }
}
