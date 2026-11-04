package io.ktor.utils.io;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@kotlin.a1
public final class k0<T> implements Externalizable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f297083c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f297084d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private q0<T> f297085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private T f297086b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public k0(@Nullable q0<T> q0Var, @Nullable T t10) {
        this.f297085a = q0Var;
        this.f297086b = t10;
    }

    private final Object readResolve() {
        T t10 = this.f297086b;
        Intrinsics.checkNotNull(t10);
        return t10;
    }

    @Override // java.io.Externalizable
    public void readExternal(@NotNull ObjectInput in) throws ClassNotFoundException, IOException {
        Intrinsics.checkNotNullParameter(in, "in");
        Object object = in.readObject();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type io.ktor.utils.io.JvmSerializer<T of io.ktor.utils.io.DefaultJvmSerializerReplacement>");
        q0<T> q0Var = (q0) object;
        this.f297085a = q0Var;
        Intrinsics.checkNotNull(q0Var);
        Object object2 = in.readObject();
        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type kotlin.ByteArray");
        this.f297086b = q0Var.g4((byte[]) object2);
    }

    @Override // java.io.Externalizable
    public void writeExternal(@NotNull ObjectOutput out) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeObject(this.f297085a);
        q0<T> q0Var = this.f297085a;
        Intrinsics.checkNotNull(q0Var);
        T t10 = this.f297086b;
        Intrinsics.checkNotNull(t10);
        out.writeObject(q0Var.n2(t10));
    }

    public k0() {
        this(null, null);
    }
}
