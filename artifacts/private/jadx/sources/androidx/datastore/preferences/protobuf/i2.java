package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes2.dex */
@y
final class i2 implements s3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p2 f50385b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p2 f50386a;

    class a implements p2 {
        a() {
        }

        @Override // androidx.datastore.preferences.protobuf.p2
        public o2 a(Class<?> clazz) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.datastore.preferences.protobuf.p2
        public boolean b(Class<?> clazz) {
            return false;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50387a;

        static {
            int[] iArr = new int[j3.values().length];
            f50387a = iArr;
            try {
                iArr[j3.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private static class c implements p2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p2[] f50388a;

        c(p2... factories) {
            this.f50388a = factories;
        }

        @Override // androidx.datastore.preferences.protobuf.p2
        public o2 a(Class<?> clazz) {
            for (p2 p2Var : this.f50388a) {
                if (p2Var.b(clazz)) {
                    return p2Var.a(clazz);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + clazz.getName());
        }

        @Override // androidx.datastore.preferences.protobuf.p2
        public boolean b(Class<?> clazz) {
            for (p2 p2Var : this.f50388a) {
                if (p2Var.b(clazz)) {
                    return true;
                }
            }
            return false;
        }
    }

    public i2() {
        this(c());
    }

    private static boolean b(o2 messageInfo) {
        int i10 = 4 >> 1;
        return b.f50387a[messageInfo.p().ordinal()] != 1;
    }

    private static p2 c() {
        int i10 = 2 ^ 0;
        return new c(k1.c(), d());
    }

    private static p2 d() {
        if (k3.f50408d) {
            return f50385b;
        }
        try {
            return (p2) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f50385b;
        }
    }

    private static <T> r3<T> e(Class<T> messageType, o2 messageInfo) {
        if (f(messageType)) {
            return t2.U(messageType, messageInfo, c3.b(), e2.b(), t3.R(), b(messageInfo) ? y0.b() : null, n2.b());
        }
        a3 a3VarA = c3.a();
        w0<?> w0VarA = null;
        c2 c2VarA = e2.a();
        r4<?, ?> r4VarQ = t3.Q();
        if (b(messageInfo)) {
            w0VarA = y0.a();
        }
        return t2.U(messageType, messageInfo, a3VarA, c2VarA, r4VarQ, w0VarA, n2.a());
    }

    private static boolean f(Class<?> messageType) {
        return k3.f50408d || l1.class.isAssignableFrom(messageType);
    }

    @Override // androidx.datastore.preferences.protobuf.s3
    public <T> r3<T> a(Class<T> messageType) {
        t3.K(messageType);
        o2 o2VarA = this.f50386a.a(messageType);
        if (o2VarA.a()) {
            return f(messageType) ? u2.m(t3.R(), y0.b(), o2VarA.b()) : u2.m(t3.Q(), y0.a(), o2VarA.b());
        }
        return e(messageType, o2VarA);
    }

    private i2(p2 messageInfoFactory) {
        this.f50386a = (p2) s1.e(messageInfoFactory, "messageInfoFactory");
    }
}
