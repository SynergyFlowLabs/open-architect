package io.ktor.serialization;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.j1;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nWebsocketContentConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebsocketContentConverter.kt\nio/ktor/serialization/WebsocketContentConverterKt\n+ 2 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,97:1\n65#2,18:98\n65#2,18:116\n*S KotlinDebug\n*F\n+ 1 WebsocketContentConverter.kt\nio/ktor/serialization/WebsocketContentConverterKt\n*L\n82#1:98,18\n96#1:116,18\n*E\n"})
public final class i {
    public static final /* synthetic */ <T> Object a(h hVar, io.ktor.websocket.e eVar, Charset charset, kotlin.coroutines.d<? super T> dVar) {
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        kotlin.reflect.d dVarD = j1.d(Object.class);
        try {
            Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        } catch (Throwable unused) {
        }
        ri.b bVar = new ri.b(dVarD, null);
        h0.e(0);
        Object objA = hVar.a(charset, bVar, eVar, dVar);
        h0.e(1);
        Intrinsics.reifiedOperationMarker(1, androidx.exifinterface.media.a.f51379e5);
        return objA;
    }

    public static /* synthetic */ Object b(h hVar, io.ktor.websocket.e eVar, Charset charset, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        kotlin.reflect.d dVarD = j1.d(Object.class);
        try {
            Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        } catch (Throwable unused) {
        }
        ri.b bVar = new ri.b(dVarD, null);
        h0.e(0);
        Object objA = hVar.a(charset, bVar, eVar, dVar);
        h0.e(1);
        Intrinsics.reifiedOperationMarker(1, androidx.exifinterface.media.a.f51379e5);
        return objA;
    }

    public static final /* synthetic */ <T> Object c(h hVar, T t10, Charset charset, kotlin.coroutines.d<? super io.ktor.websocket.e> dVar) {
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        kotlin.reflect.d dVarD = j1.d(Object.class);
        try {
            Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        } catch (Throwable unused) {
        }
        ri.b bVar = new ri.b(dVarD, null);
        h0.e(0);
        Object objC = hVar.c(charset, bVar, t10, dVar);
        h0.e(1);
        return objC;
    }

    public static /* synthetic */ Object d(h hVar, Object obj, Charset charset, kotlin.coroutines.d dVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        kotlin.reflect.d dVarD = j1.d(Object.class);
        try {
            Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        } catch (Throwable unused) {
        }
        ri.b bVar = new ri.b(dVarD, null);
        h0.e(0);
        Object objC = hVar.c(charset, bVar, obj, dVar);
        h0.e(1);
        return objC;
    }
}
