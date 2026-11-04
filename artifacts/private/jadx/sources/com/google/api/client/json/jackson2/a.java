package com.google.api.client.json.jackson2;

import com.fasterxml.jackson.core.f;
import com.fasterxml.jackson.core.h;
import com.fasterxml.jackson.core.n;
import com.google.api.client.json.d;
import com.google.api.client.json.e;
import com.google.api.client.json.g;
import com.google.api.client.json.j;
import com.google.api.client.util.h0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f115784a;

    /* JADX INFO: renamed from: com.google.api.client.json.jackson2.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C1026a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f115785a;

        static {
            int[] iArr = new int[n.values().length];
            f115785a = iArr;
            try {
                iArr[n.END_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f115785a[n.START_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f115785a[n.END_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f115785a[n.START_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f115785a[n.VALUE_FALSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f115785a[n.VALUE_TRUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f115785a[n.VALUE_NULL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f115785a[n.VALUE_STRING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f115785a[n.VALUE_NUMBER_FLOAT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f115785a[n.VALUE_NUMBER_INT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f115785a[n.FIELD_NAME.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final a f115786a = new a();

        b() {
        }
    }

    public a() {
        f fVar = new f();
        this.f115784a = fVar;
        fVar.z(h.b.AUTO_CLOSE_JSON_CONTENT, false);
    }

    static j q(n nVar) {
        if (nVar == null) {
            return null;
        }
        switch (C1026a.f115785a[nVar.ordinal()]) {
            case 1:
                return j.END_ARRAY;
            case 2:
                return j.START_ARRAY;
            case 3:
                return j.END_OBJECT;
            case 4:
                return j.START_OBJECT;
            case 5:
                return j.VALUE_FALSE;
            case 6:
                return j.VALUE_TRUE;
            case 7:
                return j.VALUE_NULL;
            case 8:
                return j.VALUE_STRING;
            case 9:
                return j.VALUE_NUMBER_FLOAT;
            case 10:
                return j.VALUE_NUMBER_INT;
            case 11:
                return j.FIELD_NAME;
            default:
                return j.NOT_AVAILABLE;
        }
    }

    public static a r() {
        return b.f115786a;
    }

    @Override // com.google.api.client.json.d
    public e a(OutputStream outputStream, Charset charset) throws IOException {
        return new com.google.api.client.json.jackson2.b(this, this.f115784a.J(outputStream, com.fasterxml.jackson.core.e.UTF8));
    }

    @Override // com.google.api.client.json.d
    public e b(Writer writer) throws IOException {
        return new com.google.api.client.json.jackson2.b(this, this.f115784a.K(writer));
    }

    @Override // com.google.api.client.json.d
    public g d(InputStream inputStream) throws IOException {
        h0.d(inputStream);
        return new c(this, this.f115784a.M(inputStream));
    }

    @Override // com.google.api.client.json.d
    public g e(InputStream inputStream, Charset charset) throws IOException {
        h0.d(inputStream);
        return new c(this, this.f115784a.M(inputStream));
    }

    @Override // com.google.api.client.json.d
    public g f(Reader reader) throws IOException {
        h0.d(reader);
        return new c(this, this.f115784a.N(reader));
    }

    @Override // com.google.api.client.json.d
    public g g(String str) throws IOException {
        h0.d(str);
        return new c(this, this.f115784a.O(str));
    }
}
