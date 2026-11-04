package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
@y
final class f2 implements p3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final m2 f125939b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m2 f125940a;

    class a implements m2 {
        a() {
        }

        @Override // com.google.protobuf.m2
        public l2 a(Class<?> clazz) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.protobuf.m2
        public boolean b(Class<?> clazz) {
            return false;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f125941a;

        static {
            int[] iArr = new int[h3.values().length];
            f125941a = iArr;
            try {
                iArr[h3.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private static class c implements m2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private m2[] f125942a;

        c(m2... factories) {
            this.f125942a = factories;
        }

        @Override // com.google.protobuf.m2
        public l2 a(Class<?> clazz) {
            for (m2 m2Var : this.f125942a) {
                if (m2Var.b(clazz)) {
                    return m2Var.a(clazz);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + clazz.getName());
        }

        @Override // com.google.protobuf.m2
        public boolean b(Class<?> clazz) {
            for (m2 m2Var : this.f125942a) {
                if (m2Var.b(clazz)) {
                    return true;
                }
            }
            return false;
        }
    }

    public f2() {
        this(c());
    }

    private static boolean b(l2 messageInfo) {
        return b.f125941a[messageInfo.p().ordinal()] != 1;
    }

    private static m2 c() {
        return new c(k1.c(), d());
    }

    private static m2 d() {
        try {
            return (m2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f125939b;
        }
    }

    private static <T> o3<T> e(Class<T> messageType, l2 messageInfo) {
        if (l1.class.isAssignableFrom(messageType)) {
            return b(messageInfo) ? q2.U(messageType, messageInfo, z2.b(), b2.b(), q3.R(), y0.b(), k2.b()) : q2.U(messageType, messageInfo, z2.b(), b2.b(), q3.R(), null, k2.b());
        }
        return b(messageInfo) ? q2.U(messageType, messageInfo, z2.a(), b2.a(), q3.Q(), y0.a(), k2.a()) : q2.U(messageType, messageInfo, z2.a(), b2.a(), q3.Q(), null, k2.a());
    }

    @Override // com.google.protobuf.p3
    public <T> o3<T> a(Class<T> messageType) {
        q3.K(messageType);
        l2 l2VarA = this.f125940a.a(messageType);
        if (l2VarA.a()) {
            return l1.class.isAssignableFrom(messageType) ? r2.m(q3.R(), y0.b(), l2VarA.b()) : r2.m(q3.Q(), y0.a(), l2VarA.b());
        }
        return e(messageType, l2VarA);
    }

    private f2(m2 messageInfoFactory) {
        this.f125940a = (m2) s1.e(messageInfoFactory, "messageInfoFactory");
    }
}
