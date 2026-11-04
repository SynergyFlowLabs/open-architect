package com.google.protobuf;

import com.google.protobuf.l1;
import com.google.protobuf.l1.b;
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

/* JADX INFO: loaded from: classes5.dex */
public abstract class l1<MessageType extends l1<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends com.google.protobuf.a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, l1<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected p4 unknownFields = p4.c();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126036a;

        static {
            int[] iArr = new int[x4.c.values().length];
            f126036a = iArr;
            try {
                iArr[x4.c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126036a[x4.c.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class b<MessageType extends l1<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends com.google.protobuf.a.AbstractC1212a<MessageType, BuilderType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MessageType f126037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected MessageType f126038b;

        protected b(MessageType messagetype) {
            this.f126037a = messagetype;
            if (messagetype.nl()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f126038b = (MessageType) Nl();
        }

        private static <MessageType> void Ml(MessageType dest, MessageType src) {
            i3.a().j(dest).a(dest, src);
        }

        private MessageType Nl() {
            return (MessageType) this.f126037a.Bl();
        }

        @Override // com.google.protobuf.n2.a
        /* JADX INFO: renamed from: Al, reason: merged with bridge method [inline-methods] */
        public final MessageType build() {
            MessageType messagetype = (MessageType) B1();
            if (messagetype.Z()) {
                return messagetype;
            }
            throw com.google.protobuf.a.AbstractC1212a.zl(messagetype);
        }

        @Override // com.google.protobuf.n2.a
        /* JADX INFO: renamed from: Bl, reason: merged with bridge method [inline-methods] */
        public MessageType B1() {
            if (!this.f126038b.nl()) {
                return this.f126038b;
            }
            this.f126038b.ol();
            return this.f126038b;
        }

        @Override // com.google.protobuf.n2.a
        /* JADX INFO: renamed from: Cl, reason: merged with bridge method [inline-methods] */
        public final BuilderType clear() {
            if (this.f126037a.nl()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f126038b = (MessageType) Nl();
            return this;
        }

        @Override // com.google.protobuf.a.AbstractC1212a
        /* JADX INFO: renamed from: Dl, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BuilderType mo8clone() {
            BuilderType buildertype = (BuilderType) g1().G1();
            buildertype.f126038b = (MessageType) B1();
            return buildertype;
        }

        protected final void El() {
            if (this.f126038b.nl()) {
                return;
            }
            Fl();
        }

        protected void Fl() {
            MessageType messagetype = (MessageType) Nl();
            Ml(messagetype, this.f126038b);
            this.f126038b = messagetype;
        }

        @Override // com.google.protobuf.o2
        /* JADX INFO: renamed from: Gl, reason: merged with bridge method [inline-methods] */
        public MessageType g1() {
            return this.f126037a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.a.AbstractC1212a
        /* JADX INFO: renamed from: Hl, reason: merged with bridge method [inline-methods] */
        public BuilderType nl(MessageType messagetype) {
            return (BuilderType) Jl(messagetype);
        }

        @Override // com.google.protobuf.a.AbstractC1212a
        /* JADX INFO: renamed from: Il, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BuilderType rl(z input, v0 extensionRegistry) throws IOException {
            El();
            try {
                i3.a().j(this.f126038b).j(this.f126038b, a0.V(input), extensionRegistry);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }

        public BuilderType Jl(MessageType message) {
            if (g1().equals(message)) {
                return this;
            }
            El();
            Ml(this.f126038b, message);
            return this;
        }

        @Override // com.google.protobuf.a.AbstractC1212a
        /* JADX INFO: renamed from: Kl, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BuilderType wl(byte[] bArr, int i10, int i11) throws t1 {
            return (BuilderType) Va(bArr, i10, i11, v0.d());
        }

        @Override // com.google.protobuf.a.AbstractC1212a
        /* JADX INFO: renamed from: Ll, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BuilderType xl(byte[] input, int offset, int length, v0 extensionRegistry) throws t1 {
            El();
            try {
                i3.a().j(this.f126038b).i(this.f126038b, input, offset, offset + length, new l.b(extensionRegistry));
                return this;
            } catch (t1 e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
            } catch (IndexOutOfBoundsException unused) {
                throw t1.n();
            }
        }

        @Override // com.google.protobuf.o2
        public final boolean Z() {
            return l1.ml(this.f126038b, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static class c<T extends l1<T, ?>> extends com.google.protobuf.b<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T f126039b;

        public c(T defaultInstance) {
            this.f126039b = defaultInstance;
        }

        @Override // com.google.protobuf.f3
        /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
        public T t(z zVar, v0 v0Var) throws t1 {
            return (T) l1.Tl(this.f126039b, zVar, v0Var);
        }

        @Override // com.google.protobuf.b, com.google.protobuf.f3
        /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public T y(byte[] bArr, int i10, int i11, v0 v0Var) throws t1 {
            return (T) l1.Ul(this.f126039b, bArr, i10, i11, v0Var);
        }
    }

    public static abstract class d<MessageType extends e<MessageType, BuilderType>, BuilderType extends d<MessageType, BuilderType>> extends b<MessageType, BuilderType> implements f<MessageType, BuilderType> {
        protected d(MessageType defaultInstance) {
            super(defaultInstance);
        }

        private f1<g> Rl() {
            f1<g> f1Var = ((e) this.f126038b).extensions;
            if (!f1Var.D()) {
                return f1Var;
            }
            f1 f1VarK = f1Var.clone();
            ((e) this.f126038b).extensions = f1VarK;
            return f1VarK;
        }

        private void Vl(final h<MessageType, ?> extension) {
            if (extension.h() != g1()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // com.google.protobuf.l1.f
        public final <Type> Type D9(t0<MessageType, Type> t0Var) {
            return (Type) ((e) this.f126038b).D9(t0Var);
        }

        @Override // com.google.protobuf.l1.b
        protected void Fl() {
            super.Fl();
            if (((e) this.f126038b).extensions != f1.s()) {
                MessageType messagetype = this.f126038b;
                ((e) messagetype).extensions = ((e) messagetype).extensions.clone();
            }
        }

        @Override // com.google.protobuf.l1.f
        public final <Type> int I9(final t0<MessageType, List<Type>> extension) {
            return ((e) this.f126038b).I9(extension);
        }

        @Override // com.google.protobuf.l1.f
        public final <Type> boolean Ka(final t0<MessageType, Type> extension) {
            return ((e) this.f126038b).Ka(extension);
        }

        @Override // com.google.protobuf.l1.f
        public final <Type> Type Nk(t0<MessageType, List<Type>> t0Var, int i10) {
            return (Type) ((e) this.f126038b).Nk(t0Var, i10);
        }

        public final <Type> BuilderType Ol(final t0<MessageType, List<Type>> extension, final Type value) {
            h<MessageType, ?> hVarPb = l1.Pb(extension);
            Vl(hVarPb);
            El();
            Rl().h(hVarPb.f126052d, hVarPb.j(value));
            return this;
        }

        @Override // com.google.protobuf.l1.b
        /* JADX INFO: renamed from: Pl, reason: merged with bridge method [inline-methods] */
        public final MessageType B1() {
            if (!((e) this.f126038b).nl()) {
                return (MessageType) this.f126038b;
            }
            ((e) this.f126038b).extensions.J();
            return (MessageType) super.B1();
        }

        public final BuilderType Ql(final t0<MessageType, ?> extension) {
            h<MessageType, ?> hVarPb = l1.Pb(extension);
            Vl(hVarPb);
            El();
            Rl().j(hVarPb.f126052d);
            return this;
        }

        void Sl(f1<g> extensions) {
            El();
            ((e) this.f126038b).extensions = extensions;
        }

        public final <Type> BuilderType Tl(final t0<MessageType, List<Type>> extension, final int index, final Type value) {
            h<MessageType, ?> hVarPb = l1.Pb(extension);
            Vl(hVarPb);
            El();
            Rl().Q(hVarPb.f126052d, index, hVarPb.j(value));
            return this;
        }

        public final <Type> BuilderType Ul(final t0<MessageType, Type> extension, final Type value) {
            h<MessageType, ?> hVarPb = l1.Pb(extension);
            Vl(hVarPb);
            El();
            Rl().P(hVarPb.f126052d, hVarPb.k(value));
            return this;
        }
    }

    public static abstract class e<MessageType extends e<MessageType, BuilderType>, BuilderType extends d<MessageType, BuilderType>> extends l1<MessageType, BuilderType> implements f<MessageType, BuilderType> {
        protected f1<g> extensions = f1.s();

        protected class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Iterator<Map.Entry<g, Object>> f126040a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Map.Entry<g, Object> f126041b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f126042c;

            /* synthetic */ a(e eVar, boolean z10, a aVar) {
                this(z10);
            }

            public void a(final int end, final b0 output) throws IOException {
                while (true) {
                    Map.Entry<g, Object> entry = this.f126041b;
                    if (entry == null || entry.getKey().i() >= end) {
                        return;
                    }
                    g key = this.f126041b.getKey();
                    if (this.f126042c && key.B() == x4.c.MESSAGE && !key.F()) {
                        output.P1(key.i(), (n2) this.f126041b.getValue());
                    } else {
                        f1.U(key, this.f126041b.getValue(), output);
                    }
                    if (this.f126040a.hasNext()) {
                        this.f126041b = this.f126040a.next();
                    } else {
                        this.f126041b = null;
                    }
                }
            }

            private a(boolean messageSetWireFormat) {
                Iterator itI = e.this.extensions.I();
                this.f126040a = itI;
                if (itI.hasNext()) {
                    this.f126041b = (Map.Entry) itI.next();
                }
                this.f126042c = messageSetWireFormat;
            }
        }

        private void Zl(z input, h<?, ?> extension, v0 extensionRegistry, int typeId) throws IOException {
            jm(input, extensionRegistry, extension, x4.c(typeId, 2), typeId);
        }

        private void fm(u rawBytes, v0 extensionRegistry, h<?, ?> extension) throws IOException {
            n2 n2Var = (n2) this.extensions.u(extension.f126052d);
            n2.a aVarR1 = n2Var != null ? n2Var.r1() : null;
            if (aVarR1 == null) {
                aVarR1 = extension.c().G1();
            }
            aVarR1.Yh(rawBytes, extensionRegistry);
            am().P(extension.f126052d, extension.j(aVarR1.build()));
        }

        private <MessageType extends n2> void gm(MessageType defaultInstance, z input, v0 extensionRegistry) throws IOException {
            int iA0 = 0;
            u uVarY = null;
            h<?, ?> hVarC = null;
            while (true) {
                int iZ = input.Z();
                if (iZ == 0) {
                    break;
                }
                if (iZ == x4.f126479s) {
                    iA0 = input.a0();
                    if (iA0 != 0) {
                        hVarC = extensionRegistry.c(defaultInstance, iA0);
                    }
                } else if (iZ == x4.f126480t) {
                    if (iA0 == 0 || hVarC == null) {
                        uVarY = input.y();
                    } else {
                        Zl(input, hVarC, extensionRegistry, iA0);
                        uVarY = null;
                    }
                } else if (!input.h0(iZ)) {
                    break;
                }
            }
            input.a(x4.f126478r);
            if (uVarY != null && iA0 != 0) {
                if (hVarC != null) {
                    fm(uVarY, extensionRegistry, hVarC);
                    return;
                }
                ql(iA0, uVarY);
            }
        }

        /* JADX WARN: Code duplicated, block: B:4:0x0009  */
        private boolean jm(z input, v0 extensionRegistry, h<?, ?> extension, int tag, int fieldNumber) throws IOException {
            boolean z10;
            boolean z11;
            Object objBuild;
            n2 n2Var;
            int iB = x4.b(tag);
            if (extension == null) {
                z11 = true;
                z10 = false;
            } else if (iB == f1.A(extension.f126052d.u(), false)) {
                z11 = false;
                z10 = false;
            } else {
                g gVar = extension.f126052d;
                if (gVar.f126047d && gVar.f126046c.n() && iB == f1.A(extension.f126052d.u(), true)) {
                    z10 = true;
                    z11 = false;
                } else {
                    z11 = true;
                    z10 = false;
                }
            }
            if (z11) {
                return Vl(tag, input);
            }
            am();
            if (z10) {
                int iU = input.u(input.O());
                if (extension.f126052d.u() == x4.b.f126495s) {
                    while (input.g() > 0) {
                        s1.c cVarA = extension.f126052d.A().a(input.A());
                        if (cVarA == null) {
                            return true;
                        }
                        this.extensions.h(extension.f126052d, extension.j(cVarA));
                    }
                } else {
                    while (input.g() > 0) {
                        this.extensions.h(extension.f126052d, f1.O(input, extension.f126052d.u(), false));
                    }
                }
                input.t(iU);
            } else {
                int i10 = a.f126036a[extension.f126052d.B().ordinal()];
                if (i10 == 1) {
                    n2.a aVarR1 = (extension.f126052d.F() || (n2Var = (n2) this.extensions.u(extension.f126052d)) == null) ? null : n2Var.r1();
                    if (aVarR1 == null) {
                        aVarR1 = extension.c().G1();
                    }
                    if (extension.f126052d.u() == x4.b.f126491l) {
                        input.F(extension.d(), aVarR1, extensionRegistry);
                    } else {
                        input.J(aVarR1, extensionRegistry);
                    }
                    objBuild = aVarR1.build();
                } else if (i10 != 2) {
                    objBuild = f1.O(input, extension.f126052d.u(), false);
                } else {
                    int iA = input.A();
                    s1.c cVarA2 = extension.f126052d.A().a(iA);
                    if (cVarA2 == null) {
                        sl(fieldNumber, iA);
                        return true;
                    }
                    objBuild = cVarA2;
                }
                if (extension.f126052d.F()) {
                    this.extensions.h(extension.f126052d, extension.j(objBuild));
                } else {
                    this.extensions.P(extension.f126052d, extension.j(objBuild));
                }
            }
            return true;
        }

        private void mm(final h<MessageType, ?> extension) {
            if (extension.h() != g1()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // com.google.protobuf.l1.f
        public final <Type> Type D9(t0<MessageType, Type> t0Var) {
            h<MessageType, ?> hVarPb = l1.Pb(t0Var);
            mm(hVarPb);
            Object objU = this.extensions.u(hVarPb.f126052d);
            return objU == null ? hVarPb.f126050b : (Type) hVarPb.g(objU);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.n2
        public /* bridge */ /* synthetic */ n2.a G1() {
            return super.G1();
        }

        @Override // com.google.protobuf.l1.f
        public final <Type> int I9(final t0<MessageType, List<Type>> extension) {
            h<MessageType, ?> hVarPb = l1.Pb(extension);
            mm(hVarPb);
            return this.extensions.y(hVarPb.f126052d);
        }

        @Override // com.google.protobuf.l1.f
        public final <Type> boolean Ka(final t0<MessageType, Type> extension) {
            h<MessageType, ?> hVarPb = l1.Pb(extension);
            mm(hVarPb);
            return this.extensions.B(hVarPb.f126052d);
        }

        @Override // com.google.protobuf.l1.f
        public final <Type> Type Nk(t0<MessageType, List<Type>> t0Var, int i10) {
            h<MessageType, ?> hVarPb = l1.Pb(t0Var);
            mm(hVarPb);
            return (Type) hVarPb.i(this.extensions.x(hVarPb.f126052d, i10));
        }

        @x
        f1<g> am() {
            if (this.extensions.D()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        protected boolean bm() {
            return this.extensions.E();
        }

        protected int cm() {
            return this.extensions.z();
        }

        protected int dm() {
            return this.extensions.v();
        }

        protected final void em(final MessageType other) {
            if (this.extensions.D()) {
                this.extensions = this.extensions.clone();
            }
            this.extensions.K(other.extensions);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.o2
        public /* bridge */ /* synthetic */ n2 g1() {
            return super.g1();
        }

        protected e<MessageType, BuilderType>.a hm() {
            return new a(this, false, null);
        }

        protected e<MessageType, BuilderType>.a im() {
            return new a(this, true, null);
        }

        protected <MessageType extends n2> boolean km(MessageType defaultInstance, z input, v0 extensionRegistry, int tag) throws IOException {
            int iA = x4.a(tag);
            return jm(input, extensionRegistry, extensionRegistry.c(defaultInstance, iA), tag, iA);
        }

        protected <MessageType extends n2> boolean lm(MessageType defaultInstance, z input, v0 extensionRegistry, int tag) throws IOException {
            if (tag != x4.f126477q) {
                return x4.b(tag) == 2 ? km(defaultInstance, input, extensionRegistry, tag) : input.h0(tag);
            }
            gm(defaultInstance, input, extensionRegistry);
            return true;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.n2
        public /* bridge */ /* synthetic */ n2.a r1() {
            return super.r1();
        }
    }

    public interface f<MessageType extends e<MessageType, BuilderType>, BuilderType extends d<MessageType, BuilderType>> extends o2 {
        <Type> Type D9(t0<MessageType, Type> extension);

        <Type> int I9(t0<MessageType, List<Type>> extension);

        <Type> boolean Ka(t0<MessageType, Type> extension);

        <Type> Type Nk(t0<MessageType, List<Type>> extension, int index);
    }

    static final class g implements f1.c<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final s1.d<?> f126044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f126045b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final x4.b f126046c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f126047d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f126048e;

        g(final s1.d<?> enumTypeMap, final int number, final x4.b type, final boolean isRepeated, final boolean isPacked) {
            this.f126044a = enumTypeMap;
            this.f126045b = number;
            this.f126046c = type;
            this.f126047d = isRepeated;
            this.f126048e = isPacked;
        }

        @Override // com.google.protobuf.f1.c
        public s1.d<?> A() {
            return this.f126044a;
        }

        @Override // com.google.protobuf.f1.c
        public x4.c B() {
            return this.f126046c.k();
        }

        @Override // com.google.protobuf.f1.c
        public boolean F() {
            return this.f126047d;
        }

        @Override // com.google.protobuf.f1.c
        public boolean K() {
            return this.f126048e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.f1.c
        public n2.a P(n2.a to, n2 from) {
            return ((b) to).Jl((l1) from);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(g other) {
            return this.f126045b - other.f126045b;
        }

        @Override // com.google.protobuf.f1.c
        public int i() {
            return this.f126045b;
        }

        @Override // com.google.protobuf.f1.c
        public x4.b u() {
            return this.f126046c;
        }
    }

    public static class h<ContainingType extends n2, Type> extends t0<ContainingType, Type> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ContainingType f126049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Type f126050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final n2 f126051c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final g f126052d;

        h(final ContainingType containingTypeDefaultInstance, final Type defaultValue, final n2 messageDefaultInstance, final g descriptor, final Class singularType) {
            if (containingTypeDefaultInstance == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (descriptor.u() == x4.b.f126492m && messageDefaultInstance == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f126049a = containingTypeDefaultInstance;
            this.f126050b = defaultValue;
            this.f126051c = messageDefaultInstance;
            this.f126052d = descriptor;
        }

        @Override // com.google.protobuf.t0
        public Type a() {
            return this.f126050b;
        }

        @Override // com.google.protobuf.t0
        public x4.b b() {
            return this.f126052d.u();
        }

        @Override // com.google.protobuf.t0
        public n2 c() {
            return this.f126051c;
        }

        @Override // com.google.protobuf.t0
        public int d() {
            return this.f126052d.i();
        }

        @Override // com.google.protobuf.t0
        public boolean f() {
            return this.f126052d.f126047d;
        }

        Object g(Object value) {
            if (!this.f126052d.F()) {
                return i(value);
            }
            if (this.f126052d.B() != x4.c.ENUM) {
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
            return this.f126049a;
        }

        Object i(Object value) {
            return this.f126052d.B() == x4.c.ENUM ? this.f126052d.f126044a.a(((Integer) value).intValue()) : value;
        }

        Object j(Object value) {
            return this.f126052d.B() == x4.c.ENUM ? Integer.valueOf(((s1.c) value).i()) : value;
        }

        Object k(Object value) {
            if (!this.f126052d.F()) {
                return j(value);
            }
            if (this.f126052d.B() != x4.c.ENUM) {
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
        private static final long f126061d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<?> f126062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f126063b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final byte[] f126064c;

        j(n2 regularForm) {
            this.f126062a = regularForm.getClass();
            this.f126063b = regularForm.getClass().getName();
            this.f126064c = regularForm.H0();
        }

        public static j a(n2 message) {
            return new j(message);
        }

        @Deprecated
        private Object b() throws ObjectStreamException {
            try {
                Field declaredField = c().getDeclaredField("defaultInstance");
                declaredField.setAccessible(true);
                return ((n2) declaredField.get(null)).G1().F3(this.f126064c).B1();
            } catch (t1 e10) {
                throw new RuntimeException("Unable to understand proto buffer", e10);
            } catch (ClassNotFoundException e11) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.f126063b, e11);
            } catch (IllegalAccessException e12) {
                throw new RuntimeException("Unable to call parsePartialFrom", e12);
            } catch (NoSuchFieldException e13) {
                throw new RuntimeException("Unable to find defaultInstance in " + this.f126063b, e13);
            } catch (SecurityException e14) {
                throw new RuntimeException("Unable to call defaultInstance in " + this.f126063b, e14);
            }
        }

        private Class<?> c() throws ClassNotFoundException {
            Class<?> cls = this.f126062a;
            return cls != null ? cls : Class.forName(this.f126063b);
        }

        protected Object readResolve() throws ObjectStreamException {
            try {
                Field declaredField = c().getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                return ((n2) declaredField.get(null)).G1().F3(this.f126064c).B1();
            } catch (t1 e10) {
                throw new RuntimeException("Unable to understand proto buffer", e10);
            } catch (ClassNotFoundException e11) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.f126063b, e11);
            } catch (IllegalAccessException e12) {
                throw new RuntimeException("Unable to call parsePartialFrom", e12);
            } catch (NoSuchFieldException unused) {
                return b();
            } catch (SecurityException e13) {
                throw new RuntimeException("Unable to call DEFAULT_INSTANCE in " + this.f126063b, e13);
            }
        }
    }

    protected static Object Al(n2 defaultInstance, String info, Object[] objects) {
        return new l3(defaultInstance, info, objects);
    }

    protected static s1.b Ch() {
        return f0.l();
    }

    public static <ContainingType extends n2, Type> h<ContainingType, Type> Cl(final ContainingType containingTypeDefaultInstance, final n2 messageDefaultInstance, final s1.d<?> enumTypeMap, final int number, final x4.b type, final boolean isPacked, final Class singularType) {
        return new h<>(containingTypeDefaultInstance, Collections.EMPTY_LIST, messageDefaultInstance, new g(enumTypeMap, number, type, true, isPacked), singularType);
    }

    public static <ContainingType extends n2, Type> h<ContainingType, Type> Dl(final ContainingType containingTypeDefaultInstance, final Type defaultValue, final n2 messageDefaultInstance, final s1.d<?> enumTypeMap, final int number, final x4.b type, final Class singularType) {
        int i10 = 7 & 0;
        return new h<>(containingTypeDefaultInstance, defaultValue, messageDefaultInstance, new g(enumTypeMap, number, type, false, false), singularType);
    }

    protected static <T extends l1<T, ?>> T El(T t10, InputStream inputStream) throws t1 {
        return (T) Hc(Ql(t10, inputStream, v0.d()));
    }

    protected static <T extends l1<T, ?>> T Fl(T t10, InputStream inputStream, v0 v0Var) throws t1 {
        return (T) Hc(Ql(t10, inputStream, v0Var));
    }

    protected static <T extends l1<T, ?>> T Gl(T t10, u uVar) throws t1 {
        return (T) Hc(Hl(t10, uVar, v0.d()));
    }

    private static <T extends l1<T, ?>> T Hc(T message) throws t1 {
        if (message != null && !message.Z()) {
            throw message.N5().a().l(message);
        }
        return message;
    }

    protected static <T extends l1<T, ?>> T Hl(T t10, u uVar, v0 v0Var) throws t1 {
        return (T) Hc(Rl(t10, uVar, v0Var));
    }

    protected static <E> s1.k<E> Ij() {
        return j3.i();
    }

    static <T extends l1<?, ?>> T Ik(Class<T> cls) {
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
        T t11 = (T) ((l1) t4.l(cls)).g1();
        if (t11 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t11);
        return t11;
    }

    protected static <T extends l1<T, ?>> T Il(T t10, z zVar) throws t1 {
        return (T) Jl(t10, zVar, v0.d());
    }

    protected static <T extends l1<T, ?>> T Jl(T t10, z zVar, v0 v0Var) throws t1 {
        return (T) Hc(Tl(t10, zVar, v0Var));
    }

    protected static <T extends l1<T, ?>> T Kl(T t10, InputStream inputStream) throws t1 {
        return (T) Hc(Tl(t10, z.k(inputStream), v0.d()));
    }

    protected static <T extends l1<T, ?>> T Ll(T t10, InputStream inputStream, v0 v0Var) throws t1 {
        return (T) Hc(Tl(t10, z.k(inputStream), v0Var));
    }

    protected static <T extends l1<T, ?>> T Ml(T t10, ByteBuffer byteBuffer) throws t1 {
        return (T) Nl(t10, byteBuffer, v0.d());
    }

    protected static <T extends l1<T, ?>> T Nl(T t10, ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (T) Hc(Jl(t10, z.o(byteBuffer), v0Var));
    }

    protected static <T extends l1<T, ?>> T Ol(T t10, byte[] bArr) throws t1 {
        return (T) Hc(Ul(t10, bArr, 0, bArr.length, v0.d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends e<MessageType, BuilderType>, BuilderType extends d<MessageType, BuilderType>, T> h<MessageType, T> Pb(t0<MessageType, T> extension) {
        if (extension.e()) {
            return (h) extension;
        }
        throw new IllegalArgumentException("Expected a lite extension.");
    }

    protected static <T extends l1<T, ?>> T Pl(T t10, byte[] bArr, v0 v0Var) throws t1 {
        return (T) Hc(Ul(t10, bArr, 0, bArr.length, v0Var));
    }

    private static <T extends l1<T, ?>> T Ql(T t10, InputStream inputStream, v0 v0Var) throws t1 {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            z zVarK = z.k(new com.google.protobuf.a.AbstractC1212a.C1213a(inputStream, z.P(i10, inputStream)));
            T t11 = (T) Tl(t10, zVarK, v0Var);
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

    private static <T extends l1<T, ?>> T Rl(T t10, u uVar, v0 v0Var) throws t1 {
        z zVarV = uVar.V();
        T t11 = (T) Tl(t10, zVarV, v0Var);
        try {
            zVarV.a(0);
            return t11;
        } catch (t1 e10) {
            throw e10.l(t11);
        }
    }

    private int Se(o3<?> nullableSchema) {
        return nullableSchema == null ? i3.a().j(this).f(this) : nullableSchema.f(this);
    }

    protected static <T extends l1<T, ?>> T Sl(T t10, z zVar) throws t1 {
        return (T) Tl(t10, zVar, v0.d());
    }

    static <T extends l1<T, ?>> T Tl(T t10, z zVar, v0 v0Var) throws t1 {
        T t11 = (T) t10.Bl();
        try {
            o3 o3VarJ = i3.a().j(t11);
            o3VarJ.j(t11, a0.V(zVar), v0Var);
            o3VarJ.e(t11);
            return t11;
        } catch (n4 e10) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends l1<T, ?>> T Ul(T t10, byte[] bArr, int i10, int i11, v0 v0Var) throws t1 {
        T t11 = (T) t10.Bl();
        try {
            o3 o3VarJ = i3.a().j(t11);
            o3VarJ.i(t11, bArr, i10, i10 + i11, new l.b(v0Var));
            o3VarJ.e(t11);
            return t11;
        } catch (n4 e10) {
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

    protected static <T extends l1<?, ?>> void Wl(Class<T> clazz, T defaultInstance) {
        defaultInstance.pl();
        defaultInstanceMap.put(clazz, defaultInstance);
    }

    protected static s1.g gj() {
        return r1.l();
    }

    protected static s1.i ij() {
        return e2.l();
    }

    static Method jl(Class clazz, String name, Class... params) {
        try {
            return clazz.getMethod(name, params);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Generated message class \"" + clazz.getName() + "\" missing method \"" + name + "\".", e10);
        }
    }

    protected static s1.f li() {
        return h1.l();
    }

    private void lk() {
        if (this.unknownFields == p4.c()) {
            this.unknownFields = p4.o();
        }
    }

    static Object ll(Method method, Object object, Object... params) {
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

    protected static final <T extends l1<T, ?>> boolean ml(T message, boolean shouldMemoize) {
        byte bByteValue = ((Byte) message.Lg(i.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = i3.a().j(message).d(message);
        if (shouldMemoize) {
            message.Ng(i.SET_MEMOIZED_IS_INITIALIZED, zD ? message : null);
        }
        return zD;
    }

    protected static s1.a sh() {
        return q.l();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.protobuf.s1$a] */
    protected static s1.a tl(s1.a list) {
        int size = list.size();
        return list.b2(size == 0 ? 10 : size * 2);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.protobuf.s1$b] */
    protected static s1.b ul(s1.b list) {
        int size = list.size();
        return list.b2(size == 0 ? 10 : size * 2);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.protobuf.s1$f] */
    protected static s1.f vl(s1.f list) {
        int size = list.size();
        return list.b2(size == 0 ? 10 : size * 2);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.protobuf.s1$g] */
    protected static s1.g wl(s1.g list) {
        int size = list.size();
        return list.b2(size == 0 ? 10 : size * 2);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.protobuf.s1$i] */
    protected static s1.i xl(s1.i list) {
        int size = list.size();
        return list.b2(size == 0 ? 10 : size * 2);
    }

    protected static <E> s1.k<E> yl(s1.k<E> list) {
        int size = list.size();
        return list.b2(size == 0 ? 10 : size * 2);
    }

    MessageType Bl() {
        return (MessageType) Lg(i.NEW_MUTABLE_INSTANCE);
    }

    @Override // com.google.protobuf.a
    int I3(o3 schema) {
        if (!nl()) {
            if (o1() != Integer.MAX_VALUE) {
                return o1();
            }
            int iSe = Se(schema);
            i8(iSe);
            return iSe;
        }
        int iSe2 = Se(schema);
        if (iSe2 >= 0) {
            return iSe2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iSe2);
    }

    @Override // com.google.protobuf.o2
    /* JADX INFO: renamed from: Kk, reason: merged with bridge method [inline-methods] */
    public final MessageType g1() {
        return (MessageType) Lg(i.GET_DEFAULT_INSTANCE);
    }

    void Ld() {
        i8(Integer.MAX_VALUE);
    }

    protected Object Lg(i method) {
        return Rg(method, null, null);
    }

    @Override // com.google.protobuf.n2
    public void Nb(b0 output) throws IOException {
        i3.a().j(this).h(this, c0.T(output));
    }

    @x
    protected Object Ng(i method, Object arg0) {
        return Rg(method, arg0, null);
    }

    Object Ob() throws Exception {
        return Lg(i.BUILD_MESSAGE_INFO);
    }

    void Oc() {
        this.memoizedHashCode = 0;
    }

    int Re() {
        return i3.a().j(this).c(this);
    }

    protected abstract Object Rg(i method, Object arg0, Object arg1);

    protected final <MessageType extends l1<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType Uf(MessageType messagetype) {
        return (BuilderType) jf().Jl(messagetype);
    }

    protected boolean Vl(int tag, z input) throws IOException {
        if (x4.b(tag) == 4) {
            return false;
        }
        lk();
        return this.unknownFields.i(tag, input);
    }

    @Override // com.google.protobuf.n2
    public final f3<MessageType> W7() {
        return (f3) Lg(i.GET_PARSER);
    }

    void Xl(int value) {
        this.memoizedHashCode = value;
    }

    @Override // com.google.protobuf.n2
    /* JADX INFO: renamed from: Yl, reason: merged with bridge method [inline-methods] */
    public final BuilderType r1() {
        return (BuilderType) ((b) Lg(i.NEW_BUILDER)).Jl(this);
    }

    @Override // com.google.protobuf.o2
    public final boolean Z() {
        return ml(this, true);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && getClass() == other.getClass()) {
            return i3.a().j(this).b(this, (l1) other);
        }
        return false;
    }

    public int hashCode() {
        if (nl()) {
            return Re();
        }
        if (kl()) {
            Xl(Re());
        }
        return il();
    }

    @Override // com.google.protobuf.a
    void i8(int size) {
        if (size >= 0) {
            this.memoizedSerializedSize = (size & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + size);
        }
    }

    int il() {
        return this.memoizedHashCode;
    }

    protected final <MessageType extends l1<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType jf() {
        return (BuilderType) Lg(i.NEW_BUILDER);
    }

    boolean kl() {
        return il() == 0;
    }

    boolean nl() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.protobuf.a
    int o1() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    protected void ol() {
        i3.a().j(this).e(this);
        pl();
    }

    void pl() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    protected void ql(int fieldNumber, u value) {
        lk();
        this.unknownFields.l(fieldNumber, value);
    }

    protected final void rl(p4 unknownFields) {
        this.unknownFields = p4.n(this.unknownFields, unknownFields);
    }

    protected void sl(int tag, int value) {
        lk();
        this.unknownFields.m(tag, value);
    }

    public String toString() {
        return p2.f(this, super.toString());
    }

    @Override // com.google.protobuf.n2
    public int w1() {
        return I3(null);
    }

    @Override // com.google.protobuf.n2
    /* JADX INFO: renamed from: zl, reason: merged with bridge method [inline-methods] */
    public final BuilderType G1() {
        return (BuilderType) Lg(i.NEW_BUILDER);
    }
}
