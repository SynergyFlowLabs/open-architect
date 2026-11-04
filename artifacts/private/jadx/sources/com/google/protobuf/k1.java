package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
class k1 implements m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k1 f126024a = new k1();

    private k1() {
    }

    public static k1 c() {
        return f126024a;
    }

    @Override // com.google.protobuf.m2
    public l2 a(Class<?> messageType) {
        if (!l1.class.isAssignableFrom(messageType)) {
            throw new IllegalArgumentException("Unsupported message type: " + messageType.getName());
        }
        try {
            return (l2) l1.Ik(messageType.asSubclass(l1.class)).Ob();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + messageType.getName(), e10);
        }
    }

    @Override // com.google.protobuf.m2
    public boolean b(Class<?> messageType) {
        return l1.class.isAssignableFrom(messageType);
    }
}
