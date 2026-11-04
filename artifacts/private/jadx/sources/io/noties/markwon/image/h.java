package io.noties.markwon.image;

import androidx.annotation.p0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f297652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f297653b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f297654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f297655b;

        public a(float f10, @p0 String str) {
            this.f297654a = f10;
            this.f297655b = str;
        }

        public String toString() {
            return "Dimension{value=" + this.f297654a + ", unit='" + this.f297655b + '\'' + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public h(@p0 a aVar, @p0 a aVar2) {
        this.f297652a = aVar;
        this.f297653b = aVar2;
    }

    public String toString() {
        return "ImageSize{width=" + this.f297652a + ", height=" + this.f297653b + AbstractJsonLexerKt.END_OBJ;
    }
}
