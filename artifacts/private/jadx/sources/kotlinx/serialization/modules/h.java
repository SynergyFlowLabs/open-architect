package kotlinx.serialization.modules;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSerializersModuleBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt\n*L\n1#1,263:1\n31#1,3:264\n*S KotlinDebug\n*F\n+ 1 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt\n*L\n15#1:264,3\n*E\n"})
public final class h {

    public static final class a implements Function1<b<Object>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f316100a = new a();

        public final void c(b<Object> bVar) {
            Intrinsics.checkNotNullParameter(bVar, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<Object> bVar) {
            c(bVar);
            return Unit.f312394a;
        }
    }

    @NotNull
    public static final f a() {
        return k.a();
    }

    @NotNull
    public static final f b(@NotNull Function1<? super g, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        g gVar = new g();
        builderAction.invoke(gVar);
        return gVar.g();
    }

    public static final /* synthetic */ <T> void c(g gVar, KSerializer<T> serializer) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        gVar.d(j1.d(Object.class), serializer);
    }

    public static final <Base> void d(@NotNull g gVar, @NotNull kotlin.reflect.d<Base> baseClass, @Nullable KSerializer<Base> kSerializer, @NotNull Function1<? super b<? super Base>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        b bVar = new b(baseClass, kSerializer);
        builderAction.invoke(bVar);
        bVar.a(gVar);
    }

    public static /* synthetic */ void e(g gVar, kotlin.reflect.d baseClass, KSerializer kSerializer, Function1 builderAction, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            kSerializer = null;
        }
        if ((i10 & 4) != 0) {
            builderAction = a.f316100a;
        }
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        b bVar = new b(baseClass, kSerializer);
        builderAction.invoke(bVar);
        bVar.a(gVar);
    }

    @NotNull
    public static final <T> f f(@NotNull kotlin.reflect.d<T> kClass, @NotNull KSerializer<T> serializer) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        g gVar = new g();
        gVar.d(kClass, serializer);
        return gVar.g();
    }

    public static final /* synthetic */ <T> f g(KSerializer<T> serializer) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return f(j1.d(Object.class), serializer);
    }
}
