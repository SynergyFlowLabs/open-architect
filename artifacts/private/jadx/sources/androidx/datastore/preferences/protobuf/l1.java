package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.l1;
import androidx.datastore.preferences.protobuf.l1.b;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l1<MessageType extends l1<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends androidx.datastore.preferences.protobuf.a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, l1<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected s4 unknownFields = s4.c();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50420a;

        static {
            int[] iArr = new int[a5.c.values().length];
            f50420a = iArr;
            try {
                iArr[a5.c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50420a[a5.c.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class b<MessageType extends l1<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends androidx.datastore.preferences.protobuf.a.AbstractC0443a<MessageType, BuilderType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MessageType f50421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected MessageType f50422b;

        protected b(MessageType messagetype) {
            this.f50421a = messagetype;
            if (messagetype.A4()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f50422b = (MessageType) F4();
        }

        private static <MessageType> void E4(MessageType dest, MessageType src) {
            k3.a().j(dest).a(dest, src);
        }

        private MessageType F4() {
            return (MessageType) this.f50421a.B5();
        }

        @Override // androidx.datastore.preferences.protobuf.a.AbstractC0443a, androidx.datastore.preferences.protobuf.q2.a
        /* JADX INFO: renamed from: A4, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BuilderType jf(byte[] input, int offset, int length, v0 extensionRegistry) throws t1 {
            V3();
            try {
                k3.a().j(this.f50422b).j(this.f50422b, input, offset, offset + length, new l.b(extensionRegistry));
                return this;
            } catch (t1 e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
            } catch (IndexOutOfBoundsException unused) {
                throw t1.n();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.q2.a
        /* JADX INFO: renamed from: M3, reason: merged with bridge method [inline-methods] */
        public final MessageType build() {
            MessageType messagetype = (MessageType) B1();
            if (messagetype.Z()) {
                return messagetype;
            }
            throw androidx.datastore.preferences.protobuf.a.AbstractC0443a.J3(messagetype);
        }

        @Override // androidx.datastore.preferences.protobuf.q2.a
        /* JADX INFO: renamed from: N3, reason: merged with bridge method [inline-methods] */
        public MessageType B1() {
            if (!this.f50422b.A4()) {
                return this.f50422b;
            }
            this.f50422b.E4();
            return this.f50422b;
        }

        @Override // androidx.datastore.preferences.protobuf.q2.a
        /* JADX INFO: renamed from: R3, reason: merged with bridge method [inline-methods] */
        public final BuilderType clear() {
            if (this.f50421a.A4()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f50422b = (MessageType) F4();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.a.AbstractC0443a
        /* JADX INFO: renamed from: T3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BuilderType mo6clone() {
            BuilderType buildertype = (BuilderType) g1().G1();
            buildertype.f50422b = (MessageType) B1();
            return buildertype;
        }

        protected final void V3() {
            if (!this.f50422b.A4()) {
                W3();
            }
        }

        protected void W3() {
            MessageType messagetype = (MessageType) F4();
            E4(messagetype, this.f50422b);
            this.f50422b = messagetype;
        }

        @Override // androidx.datastore.preferences.protobuf.r2
        public final boolean Z() {
            return l1.x4(this.f50422b, false);
        }

        @Override // androidx.datastore.preferences.protobuf.r2
        /* JADX INFO: renamed from: j4, reason: merged with bridge method [inline-methods] */
        public MessageType g1() {
            return this.f50421a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.datastore.preferences.protobuf.a.AbstractC0443a
        /* JADX INFO: renamed from: n4, reason: merged with bridge method [inline-methods] */
        public BuilderType K2(MessageType messagetype) {
            return (BuilderType) u4(messagetype);
        }

        @Override // androidx.datastore.preferences.protobuf.a.AbstractC0443a
        /* JADX INFO: renamed from: t4, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BuilderType g3(z input, v0 extensionRegistry) throws IOException {
            V3();
            try {
                k3.a().j(this.f50422b).i(this.f50422b, a0.V(input), extensionRegistry);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }

        public BuilderType u4(MessageType message) {
            if (g1().equals(message)) {
                return this;
            }
            V3();
            E4(this.f50422b, message);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.a.AbstractC0443a
        /* JADX INFO: renamed from: x4, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BuilderType y3(byte[] bArr, int i10, int i11) throws t1 {
            return (BuilderType) C3(bArr, i10, i11, v0.d());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static class c<T extends l1<T, ?>> extends androidx.datastore.preferences.protobuf.b<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T f50423b;

        public c(T defaultInstance) {
            this.f50423b = defaultInstance;
        }

        @Override // androidx.datastore.preferences.protobuf.h3
        /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
        public T r(z zVar, v0 v0Var) throws t1 {
            return (T) l1.E6(this.f50423b, zVar, v0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.b, androidx.datastore.preferences.protobuf.h3
        /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public T n(byte[] bArr, int i10, int i11, v0 v0Var) throws t1 {
            return (T) l1.R6(this.f50423b, bArr, i10, i11, v0Var);
        }
    }

    public static abstract class d<MessageType extends e<MessageType, BuilderType>, BuilderType extends d<MessageType, BuilderType>> extends b<MessageType, BuilderType> implements f<MessageType, BuilderType> {
        protected d(MessageType defaultInstance) {
            super(defaultInstance);
        }

        private f1<g> U4() {
            f1<g> f1Var = ((e) this.f50422b).extensions;
            if (!f1Var.D()) {
                return f1Var;
            }
            f1 f1VarK = f1Var.clone();
            ((e) this.f50422b).extensions = f1VarK;
            return f1VarK;
        }

        private void d5(final h<MessageType, ?> extension) {
            if (extension.h() != g1()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // androidx.datastore.preferences.protobuf.l1.f
        public final <Type> boolean K1(final t0<MessageType, Type> extension) {
            return ((e) this.f50422b).K1(extension);
        }

        public final <Type> BuilderType L4(final t0<MessageType, List<Type>> extension, final Type value) {
            h<MessageType, ?> hVarP2 = l1.P2(extension);
            d5(hVarP2);
            V3();
            U4().h(hVarP2.f50436d, hVarP2.j(value));
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.l1.b
        /* JADX INFO: renamed from: P4, reason: merged with bridge method [inline-methods] */
        public final MessageType B1() {
            if (!((e) this.f50422b).A4()) {
                return (MessageType) this.f50422b;
            }
            ((e) this.f50422b).extensions.J();
            return (MessageType) super.B1();
        }

        public final BuilderType Q4(final t0<MessageType, ?> extension) {
            h<MessageType, ?> hVarP2 = l1.P2(extension);
            d5(hVarP2);
            V3();
            U4().j(hVarP2.f50436d);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.l1.f
        public final <Type> int U1(final t0<MessageType, List<Type>> extension) {
            return ((e) this.f50422b).U1(extension);
        }

        @Override // androidx.datastore.preferences.protobuf.l1.b
        protected void W3() {
            super.W3();
            if (((e) this.f50422b).extensions != f1.s()) {
                MessageType messagetype = this.f50422b;
                ((e) messagetype).extensions = ((e) messagetype).extensions.clone();
            }
        }

        void Z4(f1<g> extensions) {
            V3();
            ((e) this.f50422b).extensions = extensions;
        }

        public final <Type> BuilderType a5(final t0<MessageType, List<Type>> extension, final int index, final Type value) {
            h<MessageType, ?> hVarP2 = l1.P2(extension);
            d5(hVarP2);
            V3();
            U4().Q(hVarP2.f50436d, index, hVarP2.j(value));
            return this;
        }

        public final <Type> BuilderType b5(final t0<MessageType, Type> extension, final Type value) {
            h<MessageType, ?> hVarP2 = l1.P2(extension);
            d5(hVarP2);
            V3();
            U4().P(hVarP2.f50436d, hVarP2.k(value));
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.l1.f
        public final <Type> Type v0(t0<MessageType, List<Type>> t0Var, int i10) {
            return (Type) ((e) this.f50422b).v0(t0Var, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.l1.f
        public final <Type> Type v1(t0<MessageType, Type> t0Var) {
            return (Type) ((e) this.f50422b).v1(t0Var);
        }
    }

    public static abstract class e<MessageType extends e<MessageType, BuilderType>, BuilderType extends d<MessageType, BuilderType>> extends l1<MessageType, BuilderType> implements f<MessageType, BuilderType> {
        protected f1<g> extensions = f1.s();

        protected class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Iterator<Map.Entry<g, Object>> f50424a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Map.Entry<g, Object> f50425b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f50426c;

            /* synthetic */ a(e eVar, boolean z10, a aVar) {
                this(z10);
            }

            public void a(final int end, final b0 output) throws IOException {
                while (true) {
                    Map.Entry<g, Object> entry = this.f50425b;
                    if (entry == null || entry.getKey().i() >= end) {
                        return;
                    }
                    g key = this.f50425b.getKey();
                    if (this.f50426c && key.B() == a5.c.MESSAGE && !key.F()) {
                        output.P1(key.i(), (q2) this.f50425b.getValue());
                    } else {
                        f1.U(key, this.f50425b.getValue(), output);
                    }
                    if (this.f50424a.hasNext()) {
                        this.f50425b = this.f50424a.next();
                    } else {
                        this.f50425b = null;
                    }
                }
            }

            private a(boolean messageSetWireFormat) {
                Iterator itI = e.this.extensions.I();
                this.f50424a = itI;
                if (itI.hasNext()) {
                    this.f50425b = (Map.Entry) itI.next();
                }
                this.f50426c = messageSetWireFormat;
            }
        }

        private void g8(u rawBytes, v0 extensionRegistry, h<?, ?> extension) throws IOException {
            q2 q2Var = (q2) this.extensions.u(extension.f50436d);
            q2.a aVarR1 = q2Var != null ? q2Var.r1() : null;
            if (aVarR1 == null) {
                aVarR1 = extension.c().G1();
            }
            aVarR1.Ch(rawBytes, extensionRegistry);
            j7().P(extension.f50436d, extension.j(aVarR1.build()));
        }

        private <MessageType extends q2> void h8(MessageType defaultInstance, z input, v0 extensionRegistry) throws IOException {
            int iA0 = 0;
            u uVarY = null;
            h<?, ?> hVarC = null;
            while (true) {
                int iZ = input.Z();
                if (iZ == 0) {
                    break;
                }
                if (iZ == a5.f49964s) {
                    iA0 = input.a0();
                    if (iA0 != 0) {
                        hVarC = extensionRegistry.c(defaultInstance, iA0);
                    }
                } else if (iZ == a5.f49965t) {
                    if (iA0 == 0 || hVarC == null) {
                        uVarY = input.y();
                    } else {
                        i7(input, hVarC, extensionRegistry, iA0);
                        uVarY = null;
                    }
                } else if (!input.h0(iZ)) {
                    break;
                }
            }
            input.a(a5.f49963r);
            if (uVarY != null && iA0 != 0) {
                if (hVarC != null) {
                    g8(uVarY, extensionRegistry, hVarC);
                    return;
                }
                L4(iA0, uVarY);
            }
        }

        private void i7(z input, h<?, ?> extension, v0 extensionRegistry, int typeId) throws IOException {
            l8(input, extensionRegistry, extension, a5.c(typeId, 2), typeId);
        }

        /* JADX WARN: Code duplicated, block: B:4:0x000a  */
        private boolean l8(z input, v0 extensionRegistry, h<?, ?> extension, int tag, int fieldNumber) throws IOException {
            boolean z10;
            boolean z11;
            Object objBuild;
            q2 q2Var;
            int iB = a5.b(tag);
            if (extension == null) {
                z11 = true;
                z10 = false;
            } else if (iB == f1.A(extension.f50436d.u(), false)) {
                z11 = false;
                z10 = false;
            } else {
                g gVar = extension.f50436d;
                if (gVar.f50431d && gVar.f50430c.n() && iB == f1.A(extension.f50436d.u(), true)) {
                    z10 = true;
                    z11 = false;
                } else {
                    z11 = true;
                    z10 = false;
                }
            }
            if (z11) {
                return U6(tag, input);
            }
            j7();
            if (z10) {
                int iU = input.u(input.O());
                if (extension.f50436d.u() == a5.b.f49980s) {
                    while (input.g() > 0) {
                        s1.c cVarA = extension.f50436d.A().a(input.A());
                        if (cVarA == null) {
                            return true;
                        }
                        this.extensions.h(extension.f50436d, extension.j(cVarA));
                    }
                } else {
                    while (input.g() > 0) {
                        this.extensions.h(extension.f50436d, f1.O(input, extension.f50436d.u(), false));
                    }
                }
                input.t(iU);
            } else {
                int i10 = a.f50420a[extension.f50436d.B().ordinal()];
                if (i10 != 1) {
                    int i11 = 6 >> 2;
                    if (i10 != 2) {
                        objBuild = f1.O(input, extension.f50436d.u(), false);
                    } else {
                        int iA = input.A();
                        s1.c cVarA2 = extension.f50436d.A().a(iA);
                        if (cVarA2 == null) {
                            Q4(fieldNumber, iA);
                            return true;
                        }
                        objBuild = cVarA2;
                    }
                } else {
                    q2.a aVarR1 = (extension.f50436d.F() || (q2Var = (q2) this.extensions.u(extension.f50436d)) == null) ? null : q2Var.r1();
                    if (aVarR1 == null) {
                        aVarR1 = extension.c().G1();
                    }
                    if (extension.f50436d.u() == a5.b.f49976l) {
                        input.F(extension.d(), aVarR1, extensionRegistry);
                    } else {
                        input.J(aVarR1, extensionRegistry);
                    }
                    objBuild = aVarR1.build();
                }
                if (extension.f50436d.F()) {
                    this.extensions.h(extension.f50436d, extension.j(objBuild));
                } else {
                    this.extensions.P(extension.f50436d, extension.j(objBuild));
                }
            }
            return true;
        }

        private void o8(final h<MessageType, ?> extension) {
            if (extension.h() != g1()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        protected int A7() {
            return this.extensions.z();
        }

        protected int C7() {
            return this.extensions.v();
        }

        @Override // androidx.datastore.preferences.protobuf.l1, androidx.datastore.preferences.protobuf.q2
        public /* bridge */ /* synthetic */ q2.a G1() {
            return super.G1();
        }

        @Override // androidx.datastore.preferences.protobuf.l1.f
        public final <Type> boolean K1(final t0<MessageType, Type> extension) {
            h<MessageType, ?> hVarP2 = l1.P2(extension);
            o8(hVarP2);
            return this.extensions.B(hVarP2.f50436d);
        }

        @Override // androidx.datastore.preferences.protobuf.l1.f
        public final <Type> int U1(final t0<MessageType, List<Type>> extension) {
            h<MessageType, ?> hVarP2 = l1.P2(extension);
            o8(hVarP2);
            return this.extensions.y(hVarP2.f50436d);
        }

        protected final void f8(final MessageType other) {
            if (this.extensions.D()) {
                this.extensions = this.extensions.clone();
            }
            this.extensions.K(other.extensions);
        }

        @Override // androidx.datastore.preferences.protobuf.l1, androidx.datastore.preferences.protobuf.r2
        public /* bridge */ /* synthetic */ q2 g1() {
            return super.g1();
        }

        @x
        f1<g> j7() {
            if (this.extensions.D()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        protected e<MessageType, BuilderType>.a j8() {
            return new a(this, false, null);
        }

        protected e<MessageType, BuilderType>.a k8() {
            return new a(this, true, null);
        }

        protected <MessageType extends q2> boolean m8(MessageType defaultInstance, z input, v0 extensionRegistry, int tag) throws IOException {
            int iA = a5.a(tag);
            return l8(input, extensionRegistry, extensionRegistry.c(defaultInstance, iA), tag, iA);
        }

        protected <MessageType extends q2> boolean n8(MessageType defaultInstance, z input, v0 extensionRegistry, int tag) throws IOException {
            if (tag != a5.f49962q) {
                return a5.b(tag) == 2 ? m8(defaultInstance, input, extensionRegistry, tag) : input.h0(tag);
            }
            h8(defaultInstance, input, extensionRegistry);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.l1, androidx.datastore.preferences.protobuf.q2
        public /* bridge */ /* synthetic */ q2.a r1() {
            return super.r1();
        }

        @Override // androidx.datastore.preferences.protobuf.l1.f
        public final <Type> Type v0(t0<MessageType, List<Type>> t0Var, int i10) {
            h<MessageType, ?> hVarP2 = l1.P2(t0Var);
            o8(hVarP2);
            return (Type) hVarP2.i(this.extensions.x(hVarP2.f50436d, i10));
        }

        @Override // androidx.datastore.preferences.protobuf.l1.f
        public final <Type> Type v1(t0<MessageType, Type> t0Var) {
            h<MessageType, ?> hVarP2 = l1.P2(t0Var);
            o8(hVarP2);
            Object objU = this.extensions.u(hVarP2.f50436d);
            return objU == null ? hVarP2.f50434b : (Type) hVarP2.g(objU);
        }

        protected boolean y7() {
            return this.extensions.E();
        }
    }

    public interface f<MessageType extends e<MessageType, BuilderType>, BuilderType extends d<MessageType, BuilderType>> extends r2 {
        <Type> boolean K1(t0<MessageType, Type> extension);

        <Type> int U1(t0<MessageType, List<Type>> extension);

        <Type> Type v0(t0<MessageType, List<Type>> extension, int index);

        <Type> Type v1(t0<MessageType, Type> extension);
    }

    static final class g implements f1.c<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final s1.d<?> f50428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f50429b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final a5.b f50430c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f50431d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f50432e;

        g(final s1.d<?> enumTypeMap, final int number, final a5.b type, final boolean isRepeated, final boolean isPacked) {
            this.f50428a = enumTypeMap;
            this.f50429b = number;
            this.f50430c = type;
            this.f50431d = isRepeated;
            this.f50432e = isPacked;
        }

        @Override // androidx.datastore.preferences.protobuf.f1.c
        public s1.d<?> A() {
            return this.f50428a;
        }

        @Override // androidx.datastore.preferences.protobuf.f1.c
        public a5.c B() {
            return this.f50430c.k();
        }

        @Override // androidx.datastore.preferences.protobuf.f1.c
        public boolean F() {
            return this.f50431d;
        }

        @Override // androidx.datastore.preferences.protobuf.f1.c
        public boolean K() {
            return this.f50432e;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(g other) {
            return this.f50429b - other.f50429b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.f1.c
        public q2.a b0(q2.a to, q2 from) {
            return ((b) to).u4((l1) from);
        }

        @Override // androidx.datastore.preferences.protobuf.f1.c
        public int i() {
            return this.f50429b;
        }

        @Override // androidx.datastore.preferences.protobuf.f1.c
        public a5.b u() {
            return this.f50430c;
        }
    }

    public static class h<ContainingType extends q2, Type> extends t0<ContainingType, Type> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ContainingType f50433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Type f50434b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final q2 f50435c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final g f50436d;

        h(final ContainingType containingTypeDefaultInstance, final Type defaultValue, final q2 messageDefaultInstance, final g descriptor, final Class singularType) {
            if (containingTypeDefaultInstance == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (descriptor.u() == a5.b.f49977m && messageDefaultInstance == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f50433a = containingTypeDefaultInstance;
            this.f50434b = defaultValue;
            this.f50435c = messageDefaultInstance;
            this.f50436d = descriptor;
        }

        @Override // androidx.datastore.preferences.protobuf.t0
        public Type a() {
            return this.f50434b;
        }

        @Override // androidx.datastore.preferences.protobuf.t0
        public a5.b b() {
            return this.f50436d.u();
        }

        @Override // androidx.datastore.preferences.protobuf.t0
        public q2 c() {
            return this.f50435c;
        }

        @Override // androidx.datastore.preferences.protobuf.t0
        public int d() {
            return this.f50436d.i();
        }

        @Override // androidx.datastore.preferences.protobuf.t0
        public boolean f() {
            return this.f50436d.f50431d;
        }

        Object g(Object value) {
            if (!this.f50436d.F()) {
                return i(value);
            }
            if (this.f50436d.B() != a5.c.ENUM) {
                return value;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                arrayList.add(i(it.next()));
            }
            return arrayList;
        }

        public ContainingType h() {
            return this.f50433a;
        }

        Object i(Object value) {
            return this.f50436d.B() == a5.c.ENUM ? this.f50436d.f50428a.a(((Integer) value).intValue()) : value;
        }

        Object j(Object value) {
            return this.f50436d.B() == a5.c.ENUM ? Integer.valueOf(((s1.c) value).i()) : value;
        }

        Object k(Object value) {
            if (!this.f50436d.F()) {
                return j(value);
            }
            if (this.f50436d.B() != a5.c.ENUM) {
                return value;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                arrayList.add(j(it.next()));
            }
            return arrayList;
        }
    }

    public enum i {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected static final class j implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f50445d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<?> f50446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f50447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final byte[] f50448c;

        j(q2 regularForm) {
            this.f50446a = regularForm.getClass();
            this.f50447b = regularForm.getClass().getName();
            this.f50448c = regularForm.H0();
        }

        public static j a(q2 message) {
            return new j(message);
        }

        private Class<?> b() throws ClassNotFoundException {
            Class<?> cls = this.f50446a;
            return cls != null ? cls : Class.forName(this.f50447b);
        }

        protected Object readResolve() throws ObjectStreamException {
            try {
                Field declaredField = b().getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                return ((q2) declaredField.get(null)).G1().F3(this.f50448c).B1();
            } catch (t1 e10) {
                throw new RuntimeException("Unable to understand proto buffer", e10);
            } catch (ClassNotFoundException e11) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.f50447b, e11);
            } catch (IllegalAccessException e12) {
                throw new RuntimeException("Unable to call parsePartialFrom", e12);
            } catch (NoSuchFieldException e13) {
                throw new RuntimeException("Unable to find DEFAULT_INSTANCE in " + this.f50447b, e13);
            } catch (SecurityException e14) {
                throw new RuntimeException("Unable to call DEFAULT_INSTANCE in " + this.f50447b, e14);
            }
        }
    }

    protected static Object A5(q2 defaultInstance, String info, Object[] objects) {
        return new n3(defaultInstance, info, objects);
    }

    protected static <T extends l1<T, ?>> T A6(T t10, z zVar) throws t1 {
        return (T) E6(t10, zVar, v0.d());
    }

    public static <ContainingType extends q2, Type> h<ContainingType, Type> D5(final ContainingType containingTypeDefaultInstance, final q2 messageDefaultInstance, final s1.d<?> enumTypeMap, final int number, final a5.b type, final boolean isPacked, final Class singularType) {
        return new h<>(containingTypeDefaultInstance, Collections.EMPTY_LIST, messageDefaultInstance, new g(enumTypeMap, number, type, true, isPacked), singularType);
    }

    static <T extends l1<T, ?>> T E6(T t10, z zVar, v0 v0Var) throws t1 {
        T t11 = (T) t10.B5();
        try {
            r3 r3VarJ = k3.a().j(t11);
            r3VarJ.i(t11, a0.V(zVar), v0Var);
            r3VarJ.e(t11);
            return t11;
        } catch (q4 e10) {
            throw e10.a().l(t11);
        } catch (t1 e11) {
            e = e11;
            if (e.a()) {
                e = new t1((IOException) e);
            }
            throw e.l(t11);
        } catch (IOException e12) {
            if (e12.getCause() instanceof t1) {
                throw ((t1) e12.getCause());
            }
            throw new t1(e12).l(t11);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof t1) {
                throw ((t1) e13.getCause());
            }
            throw e13;
        }
    }

    protected static s1.a I3() {
        return q.l();
    }

    public static <ContainingType extends q2, Type> h<ContainingType, Type> I5(final ContainingType containingTypeDefaultInstance, final Type defaultValue, final q2 messageDefaultInstance, final s1.d<?> enumTypeMap, final int number, final a5.b type, final Class singularType) {
        return new h<>(containingTypeDefaultInstance, defaultValue, messageDefaultInstance, new g(enumTypeMap, number, type, false, false), singularType);
    }

    protected static s1.b J3() {
        return f0.l();
    }

    protected static <T extends l1<T, ?>> T J5(T t10, InputStream inputStream) throws t1 {
        return (T) W2(t6(t10, inputStream, v0.d()));
    }

    protected static s1.f M3() {
        return h1.l();
    }

    protected static s1.g N3() {
        return r1.l();
    }

    protected static <T extends l1<T, ?>> T N5(T t10, InputStream inputStream, v0 v0Var) throws t1 {
        return (T) W2(t6(t10, inputStream, v0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends e<MessageType, BuilderType>, BuilderType extends d<MessageType, BuilderType>, T> h<MessageType, T> P2(t0<MessageType, T> extension) {
        if (extension.e()) {
            return (h) extension;
        }
        throw new IllegalArgumentException("Expected a lite extension.");
    }

    protected static s1.j R3() {
        return h2.l();
    }

    protected static <T extends l1<T, ?>> T R5(T t10, u uVar) throws t1 {
        return (T) W2(Z5(t10, uVar, v0.d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends l1<T, ?>> T R6(T t10, byte[] bArr, int i10, int i11, v0 v0Var) throws t1 {
        if (i11 == 0) {
            return t10;
        }
        T t11 = (T) t10.B5();
        try {
            r3 r3VarJ = k3.a().j(t11);
            r3VarJ.j(t11, bArr, i10, i10 + i11, new l.b(v0Var));
            r3VarJ.e(t11);
            return t11;
        } catch (q4 e10) {
            throw e10.a().l(t11);
        } catch (t1 e11) {
            t1 t1Var = e11;
            if (t1Var.a()) {
                t1Var = new t1((IOException) t1Var);
            }
            throw t1Var.l(t11);
        } catch (IOException e12) {
            if (e12.getCause() instanceof t1) {
                throw ((t1) e12.getCause());
            }
            throw new t1(e12).l(t11);
        } catch (IndexOutOfBoundsException unused) {
            throw t1.n().l(t11);
        }
    }

    protected static <E> s1.l<E> T3() {
        return l3.i();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.datastore.preferences.protobuf.s1$a] */
    protected static s1.a U4(s1.a list) {
        int size = list.size();
        return list.b2(size == 0 ? 10 : size * 2);
    }

    private void V3() {
        if (this.unknownFields == s4.c()) {
            this.unknownFields = s4.o();
        }
    }

    private static <T extends l1<T, ?>> T W2(T message) throws t1 {
        if (message != null && !message.Z()) {
            throw message.s2().a().l(message);
        }
        return message;
    }

    static <T extends l1<?, ?>> T W3(Class<T> cls) {
        T t10 = (T) defaultInstanceMap.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 != null) {
            return t10;
        }
        T t11 = (T) ((l1) w4.l(cls)).g1();
        if (t11 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t11);
        return t11;
    }

    protected static <T extends l1<?, ?>> void Y6(Class<T> clazz, T defaultInstance) {
        defaultInstance.F4();
        defaultInstanceMap.put(clazz, defaultInstance);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.datastore.preferences.protobuf.s1$b] */
    protected static s1.b Z4(s1.b list) {
        int size = list.size();
        return list.b2(size == 0 ? 10 : size * 2);
    }

    protected static <T extends l1<T, ?>> T Z5(T t10, u uVar, v0 v0Var) throws t1 {
        return (T) W2(w6(t10, uVar, v0Var));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.datastore.preferences.protobuf.s1$f] */
    protected static s1.f a5(s1.f list) {
        int size = list.size();
        return list.b2(size == 0 ? 10 : size * 2);
    }

    protected static <T extends l1<T, ?>> T a6(T t10, z zVar) throws t1 {
        return (T) c6(t10, zVar, v0.d());
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.datastore.preferences.protobuf.s1$g] */
    protected static s1.g b5(s1.g list) {
        int size = list.size();
        return list.b2(size == 0 ? 10 : size * 2);
    }

    protected static <T extends l1<T, ?>> T c6(T t10, z zVar, v0 v0Var) throws t1 {
        return (T) W2(E6(t10, zVar, v0Var));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.datastore.preferences.protobuf.s1$j] */
    protected static s1.j d5(s1.j list) {
        int size = list.size();
        return list.b2(size == 0 ? 10 : size * 2);
    }

    protected static <T extends l1<T, ?>> T d6(T t10, InputStream inputStream) throws t1 {
        return (T) W2(E6(t10, z.k(inputStream), v0.d()));
    }

    protected static <T extends l1<T, ?>> T e6(T t10, InputStream inputStream, v0 v0Var) throws t1 {
        return (T) W2(E6(t10, z.k(inputStream), v0Var));
    }

    protected static <T extends l1<T, ?>> T i6(T t10, ByteBuffer byteBuffer) throws t1 {
        return (T) o6(t10, byteBuffer, v0.d());
    }

    protected static <T extends l1<T, ?>> T o6(T t10, ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (T) W2(c6(t10, z.o(byteBuffer), v0Var));
    }

    protected static <T extends l1<T, ?>> T p6(T t10, byte[] bArr) throws t1 {
        return (T) W2(R6(t10, bArr, 0, bArr.length, v0.d()));
    }

    private int q3(r3<?> nullableSchema) {
        return nullableSchema == null ? k3.a().j(this).f(this) : nullableSchema.f(this);
    }

    protected static <E> s1.l<E> r5(s1.l<E> list) {
        int size = list.size();
        return list.b2(size == 0 ? 10 : size * 2);
    }

    protected static <T extends l1<T, ?>> T r6(T t10, byte[] bArr, v0 v0Var) throws t1 {
        return (T) W2(R6(t10, bArr, 0, bArr.length, v0Var));
    }

    static Method t4(Class clazz, String name, Class... params) {
        try {
            return clazz.getMethod(name, params);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Generated message class \"" + clazz.getName() + "\" missing method \"" + name + "\".", e10);
        }
    }

    private static <T extends l1<T, ?>> T t6(T t10, InputStream inputStream, v0 v0Var) throws t1 {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            z zVarK = z.k(new androidx.datastore.preferences.protobuf.a.AbstractC0443a.C0444a(inputStream, z.P(i10, inputStream)));
            T t11 = (T) E6(t10, zVarK, v0Var);
            try {
                zVarK.a(0);
                return t11;
            } catch (t1 e10) {
                throw e10.l(t11);
            }
        } catch (t1 e11) {
            e = e11;
            if (e.a()) {
                e = new t1((IOException) e);
            }
            throw e;
        } catch (IOException e12) {
            throw new t1(e12);
        }
    }

    static Object w4(Method method, Object object, Object... params) {
        try {
            return method.invoke(object, params);
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

    private static <T extends l1<T, ?>> T w6(T t10, u uVar, v0 v0Var) throws t1 {
        z zVarV = uVar.V();
        T t11 = (T) E6(t10, zVarV, v0Var);
        try {
            zVarV.a(0);
            return t11;
        } catch (t1 e10) {
            throw e10.l(t11);
        }
    }

    protected static final <T extends l1<T, ?>> boolean x4(T message, boolean shouldMemoize) {
        byte bByteValue = ((Byte) message.y3(i.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = k3.a().j(message).d(message);
        if (shouldMemoize) {
            message.C3(i.SET_MEMOIZED_IS_INITIALIZED, zD ? message : null);
        }
        return zD;
    }

    boolean A4() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    MessageType B5() {
        return (MessageType) y3(i.NEW_MUTABLE_INSTANCE);
    }

    @x
    protected Object C3(i method, Object arg0) {
        return D3(method, arg0, null);
    }

    protected abstract Object D3(i method, Object arg0, Object arg1);

    protected void E4() {
        k3.a().j(this).e(this);
        F4();
    }

    void F4() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    Object K2() throws Exception {
        return y3(i.BUILD_MESSAGE_INFO);
    }

    protected void L4(int fieldNumber, u value) {
        V3();
        this.unknownFields.l(fieldNumber, value);
    }

    protected final void P4(s4 unknownFields) {
        this.unknownFields = s4.n(this.unknownFields, unknownFields);
    }

    protected void Q4(int tag, int value) {
        V3();
        this.unknownFields.m(tag, value);
    }

    @Override // androidx.datastore.preferences.protobuf.a
    int R() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    protected boolean U6(int tag, z input) throws IOException {
        if (a5.b(tag) == 4) {
            return false;
        }
        V3();
        return this.unknownFields.i(tag, input);
    }

    @Override // androidx.datastore.preferences.protobuf.q2
    public final h3<MessageType> W7() {
        return (h3) y3(i.GET_PARSER);
    }

    @Override // androidx.datastore.preferences.protobuf.q2
    public void X7(b0 output) throws IOException {
        k3.a().j(this).h(this, c0.T(output));
    }

    @Override // androidx.datastore.preferences.protobuf.r2
    public final boolean Z() {
        return x4(this, true);
    }

    void b3() {
        this.memoizedHashCode = 0;
    }

    void b7(int value) {
        this.memoizedHashCode = value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && getClass() == other.getClass()) {
            return k3.a().j(this).b(this, (l1) other);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.q2
    /* JADX INFO: renamed from: f7, reason: merged with bridge method [inline-methods] */
    public final BuilderType r1() {
        return (BuilderType) ((b) y3(i.NEW_BUILDER)).u4(this);
    }

    void g3() {
        w2(Integer.MAX_VALUE);
    }

    public int hashCode() {
        if (A4()) {
            return l3();
        }
        if (u4()) {
            b7(l3());
        }
        return n4();
    }

    @Override // androidx.datastore.preferences.protobuf.r2
    /* JADX INFO: renamed from: j4, reason: merged with bridge method [inline-methods] */
    public final MessageType g1() {
        return (MessageType) y3(i.GET_DEFAULT_INSTANCE);
    }

    int l3() {
        return k3.a().j(this).c(this);
    }

    int n4() {
        return this.memoizedHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    int o1(r3 schema) {
        if (!A4()) {
            if (R() != Integer.MAX_VALUE) {
                return R();
            }
            int iQ3 = q3(schema);
            w2(iQ3);
            return iQ3;
        }
        int iQ4 = q3(schema);
        if (iQ4 >= 0) {
            return iQ4;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iQ4);
    }

    protected final <MessageType extends l1<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType s3() {
        return (BuilderType) y3(i.NEW_BUILDER);
    }

    public String toString() {
        return s2.f(this, super.toString());
    }

    boolean u4() {
        return n4() == 0;
    }

    protected final <MessageType extends l1<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType v3(MessageType messagetype) {
        return (BuilderType) s3().u4(messagetype);
    }

    @Override // androidx.datastore.preferences.protobuf.q2
    public int w1() {
        return o1(null);
    }

    @Override // androidx.datastore.preferences.protobuf.a
    void w2(int size) {
        if (size >= 0) {
            this.memoizedSerializedSize = (size & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + size);
        }
    }

    protected Object y3(i method) {
        return D3(method, null, null);
    }

    @Override // androidx.datastore.preferences.protobuf.q2
    /* JADX INFO: renamed from: y5, reason: merged with bridge method [inline-methods] */
    public final BuilderType G1() {
        return (BuilderType) y3(i.NEW_BUILDER);
    }
}
