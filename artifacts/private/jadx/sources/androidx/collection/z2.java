package androidx.collection;

/* JADX INFO: loaded from: classes.dex */
public final class z2 {
    public static final long a(float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static final long b(int i10, int i11) {
        return (((long) i11) & com.rabbitmq.client.k0.f265952a) | (((long) i10) << 32);
    }
}
