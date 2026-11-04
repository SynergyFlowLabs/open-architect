package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.tooling.v;
import androidx.compose.runtime.tooling.y;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f42547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f42548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f42549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<v> f42550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f42551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final List<y> f42552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f42553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f42554h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f42555i;

    public l(@Nullable String str, @Nullable String str2, int i10, @NotNull List<v> list, int i11, @Nullable List<y> list2, boolean z10, boolean z11) {
        this.f42547a = str;
        this.f42548b = str2;
        this.f42549c = i10;
        this.f42550d = list;
        this.f42551e = i11;
        this.f42552f = list2;
        this.f42553g = z10;
        this.f42554h = z11;
    }

    @NotNull
    public final List<v> a() {
        return this.f42550d;
    }

    @Nullable
    public final String b() {
        return this.f42547a;
    }

    public final int c() {
        return this.f42549c;
    }

    @Nullable
    public final List<y> d() {
        return this.f42552f;
    }

    public final int e() {
        return this.f42551e;
    }

    @Nullable
    public final String f() {
        return this.f42548b;
    }

    public final boolean g() {
        return this.f42553g;
    }

    public final boolean h() {
        return this.f42554h;
    }

    @Nullable
    public final m i() {
        int i10;
        if (this.f42555i >= this.f42550d.size() && (i10 = this.f42551e) >= 0) {
            this.f42555i = i10;
        }
        if (this.f42555i >= this.f42550d.size()) {
            return null;
        }
        List<v> list = this.f42550d;
        int i11 = this.f42555i;
        this.f42555i = i11 + 1;
        v vVar = list.get(i11);
        return new m(vVar.b(), vVar.c(), vVar.a(), this.f42548b, this.f42549c);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:25:0x0071  */
    @Nullable
    public final m j(int i10, @Nullable l lVar) {
        String str;
        int i11;
        int iIntValue;
        int i12;
        if (i10 >= this.f42550d.size() && (i12 = this.f42551e) >= 0 && i12 < this.f42550d.size()) {
            int i13 = i10 - this.f42551e;
            int size = this.f42550d.size();
            int i14 = this.f42551e;
            i10 = (i13 % (size - i14)) + i14;
        }
        Integer numValueOf = null;
        if (i10 >= this.f42550d.size()) {
            return null;
        }
        v vVar = this.f42550d.get(i10);
        int iB = vVar.b();
        int iC = vVar.c();
        int iA = vVar.a();
        String str2 = this.f42548b;
        if (str2 == null) {
            str = lVar != null ? lVar.f42548b : null;
        } else {
            str = str2;
        }
        if (str2 == null) {
            if (lVar != null) {
                i11 = lVar.f42549c;
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = -1;
            }
            return new m(iB, iC, iA, str, iIntValue);
        }
        i11 = this.f42549c;
        numValueOf = Integer.valueOf(i11);
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = -1;
        }
        return new m(iB, iC, iA, str, iIntValue);
    }
}
