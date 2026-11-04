package ri;

import io.ktor.utils.io.o0;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.o;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nServiceLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceLoader.kt\nio/ktor/util/reflect/ServiceLoaderKt\n*L\n1#1,48:1\n23#1,2:49\n22#1,4:51\n23#1,2:55\n22#1,4:57\n*S KotlinDebug\n*F\n+ 1 ServiceLoader.kt\nio/ktor/util/reflect/ServiceLoaderKt\n*L\n36#1:49,2\n36#1:51,4\n47#1:55,2\n47#1:57,4\n*E\n"})
public final class a {
    @o0
    public static final /* synthetic */ <T> T a() {
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        Iterator it = ServiceLoader.load(Object.class, Object.class.getClassLoader()).iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        return (T) o.F0(o.e(it));
    }

    @o0
    public static final /* synthetic */ <T> List<T> b() {
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        Iterator it = ServiceLoader.load(Object.class, Object.class.getClassLoader()).iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        return o.c3(o.e(it));
    }

    @o0
    public static final /* synthetic */ <T> Sequence<T> c() {
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        Iterator it = ServiceLoader.load(Object.class, Object.class.getClassLoader()).iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        return o.e(it);
    }
}
