package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.w0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public static final j f47822e = new j(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47826d;

    @w0(29)
    static class a {
        private a() {
        }

        static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    private j(int i10, int i11, int i12, int i13) {
        this.f47823a = i10;
        this.f47824b = i11;
        this.f47825c = i12;
        this.f47826d = i13;
    }

    @NonNull
    public static j a(@NonNull j jVar, @NonNull j jVar2) {
        return d(jVar.f47823a + jVar2.f47823a, jVar.f47824b + jVar2.f47824b, jVar.f47825c + jVar2.f47825c, jVar.f47826d + jVar2.f47826d);
    }

    @NonNull
    public static j b(@NonNull j jVar, @NonNull j jVar2) {
        return d(Math.max(jVar.f47823a, jVar2.f47823a), Math.max(jVar.f47824b, jVar2.f47824b), Math.max(jVar.f47825c, jVar2.f47825c), Math.max(jVar.f47826d, jVar2.f47826d));
    }

    @NonNull
    public static j c(@NonNull j jVar, @NonNull j jVar2) {
        return d(Math.min(jVar.f47823a, jVar2.f47823a), Math.min(jVar.f47824b, jVar2.f47824b), Math.min(jVar.f47825c, jVar2.f47825c), Math.min(jVar.f47826d, jVar2.f47826d));
    }

    @NonNull
    public static j d(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f47822e : new j(i10, i11, i12, i13);
    }

    @NonNull
    public static j e(@NonNull Rect rect) {
        return d(rect.left, rect.top, rect.right, rect.bottom);
    }

    @NonNull
    public static j f(@NonNull j jVar, @NonNull j jVar2) {
        return d(jVar.f47823a - jVar2.f47823a, jVar.f47824b - jVar2.f47824b, jVar.f47825c - jVar2.f47825c, jVar.f47826d - jVar2.f47826d);
    }

    @NonNull
    @w0(api = 29)
    public static j g(@NonNull Insets insets) {
        return d(insets.left, insets.top, insets.right, insets.bottom);
    }

    @NonNull
    @Deprecated
    @w0(api = 29)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public static j i(@NonNull Insets insets) {
        return g(insets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f47826d == jVar.f47826d && this.f47823a == jVar.f47823a && this.f47825c == jVar.f47825c && this.f47824b == jVar.f47824b;
    }

    @NonNull
    @w0(29)
    public Insets h() {
        return a.a(this.f47823a, this.f47824b, this.f47825c, this.f47826d);
    }

    public int hashCode() {
        return (((((this.f47823a * 31) + this.f47824b) * 31) + this.f47825c) * 31) + this.f47826d;
    }

    @NonNull
    public String toString() {
        return "Insets{left=" + this.f47823a + ", top=" + this.f47824b + ", right=" + this.f47825c + ", bottom=" + this.f47826d + AbstractJsonLexerKt.END_OBJ;
    }
}
