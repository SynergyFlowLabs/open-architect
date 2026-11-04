package t0;

import android.R;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public enum b {
    Copy(0),
    Paste(1),
    Cut(2),
    SelectAll(3),
    Autofill(4);


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f376170i = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f376171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f376172b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f376173a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.Copy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.Paste.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.Cut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.SelectAll.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.Autofill.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f376173a = iArr;
        }
    }

    b(int i10) {
        this.f376171a = i10;
        this.f376172b = i10;
    }

    @NotNull
    public static kotlin.enums.a<b> l() {
        return f376170i;
    }

    public final int n() {
        return this.f376171a;
    }

    public final int o() {
        return this.f376172b;
    }

    public final int p() {
        int i10 = a.f376173a[ordinal()];
        if (i10 == 1) {
            return R.string.copy;
        }
        if (i10 == 2) {
            return R.string.paste;
        }
        if (i10 == 3) {
            return R.string.cut;
        }
        if (i10 == 4) {
            return R.string.selectAll;
        }
        if (i10 == 5) {
            return R.string.autofill;
        }
        throw new k0();
    }
}
