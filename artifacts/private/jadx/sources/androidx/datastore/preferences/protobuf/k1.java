package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes2.dex */
class k1 implements p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k1 f50404a = new k1();

    private k1() {
    }

    public static k1 c() {
        return f50404a;
    }

    @Override // androidx.datastore.preferences.protobuf.p2
    public o2 a(Class<?> messageType) {
        if (!l1.class.isAssignableFrom(messageType)) {
            throw new IllegalArgumentException("Unsupported message type: " + messageType.getName());
        }
        try {
            return (o2) l1.W3(messageType.asSubclass(l1.class)).K2();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + messageType.getName(), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p2
    public boolean b(Class<?> messageType) {
        return l1.class.isAssignableFrom(messageType);
    }
}
