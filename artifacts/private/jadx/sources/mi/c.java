package mi;

import io.ktor.utils.io.r0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.jvm.internal.r1;
import kotlin.reflect.g;
import kotlin.reflect.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nDataConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataConversion.kt\nio/ktor/util/converters/DataConversion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,137:1\n1#2:138\n*E\n"})
public final class c implements mi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<kotlin.reflect.d<?>, mi.a> f332666a;

    @r0
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Map<kotlin.reflect.d<?>, mi.a> f332667a = new LinkedHashMap();

        public final /* synthetic */ <T> void a(Function1<? super f.a<T>, Unit> configure) {
            Intrinsics.checkNotNullParameter(configure, "configure");
            Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
            c(null, configure);
        }

        public final void b(@NotNull kotlin.reflect.d<?> type, @NotNull mi.a convertor) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(convertor, "convertor");
            this.f332667a.put(type, convertor);
        }

        public final <T> void c(@NotNull s type, @NotNull Function1<? super f.a<T>, Unit> configure) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(configure, "configure");
            g gVarJ = type.J();
            Intrinsics.checkNotNull(gVarJ, "null cannot be cast to non-null type kotlin.reflect.KClass<T of io.ktor.util.converters.DataConversion.Configuration.convert>");
            kotlin.reflect.d<?> dVar = (kotlin.reflect.d) gVarJ;
            f.a aVar = new f.a(dVar);
            configure.invoke(aVar);
            b(dVar, new f(dVar, aVar.c(), (Function1) r1.q(aVar.d(), 1)));
        }

        @NotNull
        public final Map<kotlin.reflect.d<?>, mi.a> d() {
            return this.f332667a;
        }
    }

    public c(@NotNull a configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f332666a = MapsKt.toMap(configuration.d());
    }

    @Override // mi.a
    @NotNull
    public List<String> a(@Nullable Object obj) {
        if (obj == null) {
            return CollectionsKt.emptyList();
        }
        mi.a aVar = this.f332666a.get(j1.d(obj.getClass()));
        if (aVar == null) {
            aVar = e.f332668a;
        }
        return aVar.a(obj);
    }

    @Override // mi.a
    @Nullable
    public Object b(@NotNull List<String> values, @NotNull ri.b type) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(type, "type");
        if (values.isEmpty()) {
            return null;
        }
        mi.a aVar = this.f332666a.get(type.b());
        if (aVar == null) {
            aVar = e.f332668a;
        }
        return aVar.b(values, type);
    }
}
