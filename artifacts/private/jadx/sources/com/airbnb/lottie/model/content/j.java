package com.airbnb.lottie.model.content;

import androidx.annotation.p0;
import com.airbnb.lottie.w0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class j implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f88448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f88449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f88450c;

    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a l(int i10) {
            if (i10 == 1) {
                return MERGE;
            }
            if (i10 == 2) {
                return ADD;
            }
            if (i10 == 3) {
                return SUBTRACT;
            }
            if (i10 != 4) {
                return i10 != 5 ? MERGE : EXCLUDE_INTERSECTIONS;
            }
            return INTERSECT;
        }
    }

    public j(String str, a aVar, boolean z10) {
        this.f88448a = str;
        this.f88449b = aVar;
        this.f88450c = z10;
    }

    @Override // com.airbnb.lottie.model.content.c
    @p0
    public com.airbnb.lottie.animation.content.c a(w0 w0Var, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.b bVar) {
        if (w0Var.K()) {
            return new com.airbnb.lottie.animation.content.l(this);
        }
        com.airbnb.lottie.utils.d.e("Animation contains merge paths but they are disabled.");
        return null;
    }

    public a b() {
        return this.f88449b;
    }

    public String c() {
        return this.f88448a;
    }

    public boolean d() {
        return this.f88450c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f88449b + AbstractJsonLexerKt.END_OBJ;
    }
}
