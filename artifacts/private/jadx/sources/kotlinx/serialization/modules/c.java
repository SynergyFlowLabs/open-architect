package kotlinx.serialization.modules;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import kotlin.jvm.internal.q0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.m0;

/* JADX INFO: loaded from: classes13.dex */
public final class c {
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <Base, T extends Base> void a(b<? super Base> bVar, kotlin.reflect.d<T> clazz) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.simple");
        bVar.d(clazz, m0.k(null));
    }

    public static final /* synthetic */ <Base, T extends Base> void b(b<? super Base> bVar, KSerializer<T> serializer) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        bVar.d(j1.d(Object.class), serializer);
    }
}
