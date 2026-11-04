package androidx.compose.ui.node;

/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f40057a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f40058b = 2;

    /* JADX INFO: Access modifiers changed from: private */
    public static final long a(float f10, boolean z10, boolean z11) {
        return r.c((((z10 ? 1L : 0L) | (z11 ? 2L : 0L)) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(f10)) << 32));
    }

    static /* synthetic */ long b(float f10, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return a(f10, z10, z11);
    }
}
