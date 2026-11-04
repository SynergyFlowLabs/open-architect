package kotlinx.serialization.modules;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a {

    /* JADX INFO: renamed from: kotlinx.serialization.modules.a$a, reason: collision with other inner class name */
    public static final class C2320a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final KSerializer<?> f316081a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2320a(@NotNull KSerializer<?> serializer) {
            super(null);
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            this.f316081a = serializer;
        }

        @Override // kotlinx.serialization.modules.a
        @NotNull
        public KSerializer<?> a(@NotNull List<? extends KSerializer<?>> typeArgumentsSerializers) {
            Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.f316081a;
        }

        @NotNull
        public final KSerializer<?> b() {
            return this.f316081a;
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof C2320a) && Intrinsics.areEqual(((C2320a) obj).f316081a, this.f316081a);
        }

        public int hashCode() {
            return this.f316081a.hashCode();
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Function1<List<? extends KSerializer<?>>, KSerializer<?>> f316082a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull Function1<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> provider) {
            super(null);
            Intrinsics.checkNotNullParameter(provider, "provider");
            int i10 = 7 ^ 0;
            this.f316082a = provider;
        }

        @Override // kotlinx.serialization.modules.a
        @NotNull
        public KSerializer<?> a(@NotNull List<? extends KSerializer<?>> typeArgumentsSerializers) {
            Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.f316082a.invoke(typeArgumentsSerializers);
        }

        @NotNull
        public final Function1<List<? extends KSerializer<?>>, KSerializer<?>> b() {
            return this.f316082a;
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract KSerializer<?> a(@NotNull List<? extends KSerializer<?>> list);

    private a() {
    }
}
