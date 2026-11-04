package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.internal.s6;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.text.w3;
import androidx.compose.ui.text.x3;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class l implements CharSequence {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f20290g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a>> f20291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a>> f20292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final CharSequence f20293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f20294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final w3 f20295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final Pair<s, w3> f20296f;

    public /* synthetic */ l(CharSequence charSequence, long j10, w3 w3Var, Pair pair, List list, List list2, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, j10, w3Var, pair, list, list2);
    }

    public final boolean a(@NotNull CharSequence charSequence) {
        return StringsKt.z1(this.f20293c, charSequence);
    }

    public char b(int i10) {
        return this.f20293c.charAt(i10);
    }

    @Nullable
    public final List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a>> c() {
        return this.f20291a;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return b(i10);
    }

    @Nullable
    public final w3 d() {
        return this.f20295e;
    }

    @Nullable
    public final Pair<s, w3> e() {
        return this.f20296f;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return w3.g(this.f20294d, lVar.f20294d) && Intrinsics.areEqual(this.f20295e, lVar.f20295e) && Intrinsics.areEqual(this.f20296f, lVar.f20296f) && Intrinsics.areEqual(this.f20291a, lVar.f20291a) && a(lVar.f20293c);
    }

    public int f() {
        return this.f20293c.length();
    }

    @Nullable
    public final List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a>> g() {
        return this.f20292b;
    }

    public final long h() {
        return this.f20294d;
    }

    public int hashCode() {
        int iHashCode = ((this.f20293c.hashCode() * 31) + w3.o(this.f20294d)) * 31;
        w3 w3Var = this.f20295e;
        int iO = (iHashCode + (w3Var != null ? w3.o(w3Var.r()) : 0)) * 31;
        Pair<s, w3> pair = this.f20296f;
        int iHashCode2 = (iO + (pair != null ? pair.hashCode() : 0)) * 31;
        List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a>> list = this.f20291a;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public final CharSequence i() {
        return this.f20293c;
    }

    public final boolean j() {
        return this.f20296f == null;
    }

    public final void k(@NotNull char[] cArr, int i10, int i11, int i12) {
        s6.a(this.f20293c, cArr, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return f();
    }

    @Override // java.lang.CharSequence
    @NotNull
    public CharSequence subSequence(int i10, int i11) {
        return this.f20293c.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    @NotNull
    public String toString() {
        return this.f20293c.toString();
    }

    private l(CharSequence charSequence, long j10, w3 w3Var, Pair<s, w3> pair, List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a>> list, List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a>> list2) {
        this.f20291a = list;
        this.f20292b = list2;
        this.f20293c = charSequence instanceof l ? ((l) charSequence).f20293c : charSequence;
        this.f20294d = x3.c(j10, 0, charSequence.length());
        this.f20295e = w3Var != null ? w3.b(x3.c(w3Var.r(), 0, charSequence.length())) : null;
        this.f20296f = pair != null ? Pair.copy$default(pair, null, w3.b(x3.c(pair.getSecond().r(), 0, charSequence.length())), 1, null) : null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ l(CharSequence charSequence, long j10, w3 w3Var, Pair pair, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        CharSequence charSequence2 = (i10 & 1) != 0 ? "" : charSequence;
        long jA = (i10 & 2) != 0 ? w3.f42333b.a() : j10;
        w3 w3Var2 = (i10 & 4) != 0 ? null : w3Var;
        Pair pair2 = (i10 & 8) != 0 ? null : pair;
        List list3 = (i10 & 16) != 0 ? null : list;
        this(charSequence2, jA, w3Var2, pair2, list3, (i10 & 32) == 0 ? list2 : null, null);
    }
}
