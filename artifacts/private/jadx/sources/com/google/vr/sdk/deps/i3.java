package com.google.vr.sdk.deps;

import com.google.vr.sdk.deps.i3;
import com.google.vr.sdk.deps.i3.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public abstract class i3<MessageType extends i3<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends b2<MessageType, BuilderType> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Map<Object, i3<?, ?>> f129429e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected b6 f129430c = b6.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f129431d = -1;

    public static abstract class a<MessageType extends i3<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends c2<MessageType, BuilderType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MessageType f129432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected MessageType f129433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected boolean f129434c = false;

        protected a(MessageType messagetype) {
            this.f129432a = messagetype;
            this.f129433b = (MessageType) messagetype.j(d.NEW_MUTABLE_INSTANCE);
        }

        private void n(MessageType messagetype, MessageType messagetype2) {
            f5.a().c(messagetype).h(messagetype, messagetype2);
        }

        @Override // com.google.vr.sdk.deps.v4
        public final boolean Z() {
            return i3.t(this.f129433b, false);
        }

        @Override // com.google.vr.sdk.deps.u4
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final MessageType build() {
            MessageType messagetype = (MessageType) B1();
            if (messagetype.Z()) {
                return messagetype;
            }
            throw c2.e(messagetype);
        }

        @Override // com.google.vr.sdk.deps.u4
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public MessageType B1() {
            if (this.f129434c) {
                return this.f129433b;
            }
            this.f129433b.u();
            this.f129434c = true;
            return this.f129433b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.vr.sdk.deps.c2
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BuilderType clone() {
            e3.a.b0.C1250a c1250a = (BuilderType) g1().G1();
            c1250a.l(B1());
            return c1250a;
        }

        protected void i() {
            if (this.f129434c) {
                MessageType messagetype = (MessageType) this.f129433b.j(d.NEW_MUTABLE_INSTANCE);
                n(messagetype, this.f129433b);
                this.f129433b = messagetype;
                this.f129434c = false;
            }
        }

        @Override // com.google.vr.sdk.deps.v4
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public MessageType g1() {
            return this.f129432a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.vr.sdk.deps.c2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public BuilderType c(MessageType messagetype) {
            return (BuilderType) l(messagetype);
        }

        public BuilderType l(MessageType messagetype) {
            i();
            n(this.f129433b, messagetype);
            return this;
        }
    }

    public static abstract class b<MessageType extends b<MessageType, BuilderType>, BuilderType> extends i3<MessageType, BuilderType> implements v4 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        protected a3<c> f129435f = a3.b();
    }

    static final class c implements b3<c> {
        @Override // com.google.vr.sdk.deps.b3
        public final y4 J() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.vr.sdk.deps.b3
        public final o6 b() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.vr.sdk.deps.b3
        public final p6 c() {
            throw new NoSuchMethodError();
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.vr.sdk.deps.b3
        public final boolean d() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.vr.sdk.deps.b3
        public final boolean e() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.vr.sdk.deps.b3
        public final u4 f() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.vr.sdk.deps.b3
        public final int y() {
            throw new NoSuchMethodError();
        }
    }

    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER;

        static {
            int i10 = 5 | 0;
        }
    }

    protected static q3 m() {
        return f3.m();
    }

    protected static r3 n() {
        return j3.l();
    }

    protected static <E> u3<E> o() {
        return h5.i();
    }

    static <T extends i3<?, ?>> T p(Class<T> cls) {
        T t10 = (T) f129429e.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (T) f129429e.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 != null) {
            return t10;
        }
        T t11 = (T) ((i3) f6.d(cls)).g1();
        if (t11 == null) {
            throw new IllegalStateException();
        }
        f129429e.put(cls, t11);
        return t11;
    }

    static Object s(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static final <T extends i3<T, ?>> boolean t(T t10, boolean z10) {
        byte bByteValue = ((Byte) t10.j(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = f5.a().c(t10).d(t10);
        if (z10) {
            t10.k(d.SET_MEMOIZED_IS_INITIALIZED, zD ? t10 : null);
        }
        return zD;
    }

    protected static Object w(t4 t4Var, String str, Object[] objArr) {
        return new i5(t4Var, str, objArr);
    }

    static <T extends i3<T, ?>> T x(T t10, x5 x5Var, x2 x2Var) throws v3 {
        T t11 = (T) t10.j(d.NEW_MUTABLE_INSTANCE);
        try {
            f5.a().c(t11).g(t11, s2.d(x5Var), x2Var);
            t11.u();
            return t11;
        } catch (IOException e10) {
            if (e10.getCause() instanceof v3) {
                throw ((v3) e10.getCause());
            }
            throw new v3(e10.getMessage());
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof v3) {
                throw ((v3) e11.getCause());
            }
            throw e11;
        }
    }

    protected static <T extends i3<?, ?>> void z(Class<T> cls, T t10) {
        f129429e.put(cls, t10);
    }

    @Override // com.google.vr.sdk.deps.t4
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final BuilderType r1() {
        BuilderType buildertype = (BuilderType) j(d.NEW_BUILDER);
        buildertype.l(this);
        return buildertype;
    }

    @Override // com.google.vr.sdk.deps.v4
    public final boolean Z() {
        return t(this, true);
    }

    @Override // com.google.vr.sdk.deps.t4
    public void a(t2 t2Var) throws IOException {
        h(t2Var);
    }

    @Override // com.google.vr.sdk.deps.b2
    int c() {
        return this.f129431d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (g1().getClass().isInstance(obj)) {
            return f5.a().c(this).b(this, (i3) obj);
        }
        return false;
    }

    @Override // com.google.vr.sdk.deps.b2
    void g(int i10) {
        this.f129431d = i10;
    }

    public int hashCode() {
        int i10 = this.f127709a;
        if (i10 != 0) {
            return i10;
        }
        int iE = f5.a().c(this).e(this);
        this.f127709a = iE;
        return iE;
    }

    Object i() throws Exception {
        return j(d.BUILD_MESSAGE_INFO);
    }

    protected Object j(d dVar) {
        return l(dVar, null, null);
    }

    protected Object k(d dVar, Object obj) {
        return l(dVar, obj, null);
    }

    protected abstract Object l(d dVar, Object obj, Object obj2);

    @Override // com.google.vr.sdk.deps.v4
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final MessageType g1() {
        return (MessageType) j(d.GET_DEFAULT_INSTANCE);
    }

    public final c5<MessageType> r() {
        return (c5) j(d.GET_PARSER);
    }

    public String toString() {
        return m4.e(this, super.toString());
    }

    protected void u() {
        f5.a().c(this).a(this);
    }

    @Override // com.google.vr.sdk.deps.t4
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final BuilderType G1() {
        return (BuilderType) j(d.NEW_BUILDER);
    }

    @Override // com.google.vr.sdk.deps.t4
    public int w1() {
        if (this.f129431d == -1) {
            this.f129431d = e();
        }
        return this.f129431d;
    }
}
