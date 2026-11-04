package androidx.compose.ui.focus;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public enum q0 implements p0 {
    Active,
    ActiveParent,
    Captured,
    Inactive;


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f37454f = kotlin.enums.c.c(o());

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37455a;

        static {
            int[] iArr = new int[q0.values().length];
            try {
                iArr[q0.Captured.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q0.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q0.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q0.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f37455a = iArr;
        }
    }

    @NotNull
    public static kotlin.enums.a<q0> p() {
        return f37454f;
    }

    @Override // androidx.compose.ui.focus.p0
    public boolean k() {
        int i10 = a.f37455a[ordinal()];
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        if (i10 == 3 || i10 == 4) {
            return false;
        }
        throw new kotlin.k0();
    }

    @Override // androidx.compose.ui.focus.p0
    public boolean l() {
        int i10 = a.f37455a[ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 != 2 && i10 != 3 && i10 != 4) {
            throw new kotlin.k0();
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.p0
    public boolean n() {
        int i10 = a.f37455a[ordinal()];
        if (i10 != 1) {
            int i11 = 1 & 2;
            if (i10 != 2 && i10 != 3) {
                if (i10 == 4) {
                    return false;
                }
                throw new kotlin.k0();
            }
        }
        return true;
    }
}
