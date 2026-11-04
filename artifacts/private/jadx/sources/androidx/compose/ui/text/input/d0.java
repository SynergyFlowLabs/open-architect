package androidx.compose.ui.text.input;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class d0 implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f41854b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41855a;

    public d0(int i10) {
        this.f41855a = i10;
    }

    @Override // androidx.compose.ui.text.input.j
    public void a(@NotNull n nVar) {
        if (nVar.h() == -1) {
            nVar.q(nVar.l());
        }
        int iL = nVar.l();
        String string = nVar.toString();
        int i10 = this.f41855a;
        int i11 = 0;
        if (i10 <= 0) {
            int i12 = -i10;
            while (i11 < i12) {
                int iB = androidx.compose.ui.text.a0.b(string, iL);
                if (iB == -1) {
                    break;
                }
                i11++;
                iL = iB;
            }
        } else {
            while (i11 < i10) {
                int iA = androidx.compose.ui.text.a0.a(string, iL);
                if (iA == -1) {
                    break;
                }
                i11++;
                iL = iA;
            }
        }
        nVar.q(iL);
    }

    public final int b() {
        return this.f41855a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && this.f41855a == ((d0) obj).f41855a;
    }

    public int hashCode() {
        return this.f41855a;
    }

    @NotNull
    public String toString() {
        return "MoveCursorCommand(amount=" + this.f41855a + ')';
    }
}
