package io.ktor.network.sockets;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.SocketOption;
import java.nio.channels.DatagramChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nSocketOptionsPlatformCapabilities.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocketOptionsPlatformCapabilities.kt\nio/ktor/network/sockets/SocketOptionsPlatformCapabilities\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n3829#2:103\n4344#2,2:104\n1310#2:112\n1311#2:114\n1310#2,2:115\n1310#2,2:117\n1208#3,2:106\n1236#3,4:108\n1#4:113\n*S KotlinDebug\n*F\n+ 1 SocketOptionsPlatformCapabilities.kt\nio/ktor/network/sockets/SocketOptionsPlatformCapabilities\n*L\n23#1:103\n23#1:104,2\n38#1:112\n38#1:114\n54#1:115,2\n70#1:117,2\n28#1:106,2\n28#1:108,4\n*E\n"})
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final r0 f296321a = new r0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Map<String, Field> f296322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private static final Method f296323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private static final Method f296324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private static final Method f296325e;

    static {
        Map mapEmptyMap;
        Method method;
        Method method2;
        Class<?> cls;
        Method[] methods;
        int length;
        int i10;
        Class<?> cls2;
        Method[] methods2;
        int length2;
        int i11;
        try {
            try {
                try {
                    Field[] fields = Class.forName("java.net.StandardSocketOptions").getFields();
                    if (fields != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Field field : fields) {
                            int modifiers = field.getModifiers();
                            if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers) && Modifier.isPublic(modifiers)) {
                                arrayList.add(field);
                            }
                        }
                        mapEmptyMap = new LinkedHashMap(kotlin.ranges.r.u(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
                        for (Object obj : arrayList) {
                            String name = ((Field) obj).getName();
                            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                            mapEmptyMap.put(name, obj);
                        }
                    } else {
                        mapEmptyMap = MapsKt.emptyMap();
                    }
                    while (true) {
                        if (i11 >= length2) {
                            method = null;
                            break;
                        }
                        method = methods2[i11];
                        int modifiers2 = method.getModifiers();
                        if (Modifier.isPublic(modifiers2) && !Modifier.isStatic(modifiers2) && Intrinsics.areEqual(method.getName(), "setOption") && method.getParameterTypes().length == 2 && Intrinsics.areEqual(method.getReturnType(), cls2) && Intrinsics.areEqual(method.getParameterTypes()[0], SocketOption.class) && Intrinsics.areEqual(method.getParameterTypes()[1], Object.class)) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                    while (true) {
                        if (i10 >= length) {
                            method2 = null;
                            break;
                        }
                        method2 = methods[i10];
                        int modifiers3 = method2.getModifiers();
                        if (Modifier.isPublic(modifiers3) && !Modifier.isStatic(modifiers3) && Intrinsics.areEqual(method2.getName(), "setOption") && method2.getParameterTypes().length == 2 && Intrinsics.areEqual(method2.getReturnType(), cls) && Intrinsics.areEqual(method2.getParameterTypes()[0], SocketOption.class) && Intrinsics.areEqual(method2.getParameterTypes()[1], Object.class)) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                } catch (Throwable unused) {
                    mapEmptyMap = MapsKt.emptyMap();
                }
                cls2 = Class.forName("java.nio.channels.SocketChannel");
                methods2 = cls2.getMethods();
                Intrinsics.checkNotNullExpressionValue(methods2, "getMethods(...)");
                length2 = methods2.length;
                i11 = 0;
            } catch (Throwable unused2) {
            }
            cls = Class.forName("java.nio.channels.ServerSocketChannel");
            methods = cls.getMethods();
            Intrinsics.checkNotNullExpressionValue(methods, "getMethods(...)");
            length = methods.length;
            i10 = 0;
        } catch (Throwable unused3) {
        }
        f296322b = mapEmptyMap;
        Method method3 = null;
        f296323c = method;
        f296324d = method2;
        try {
            Class<?> cls3 = Class.forName("java.nio.channels.DatagramChannel");
            Method[] methods3 = cls3.getMethods();
            Intrinsics.checkNotNullExpressionValue(methods3, "getMethods(...)");
            for (Method method4 : methods3) {
                int modifiers4 = method4.getModifiers();
                if (Modifier.isPublic(modifiers4) && !Modifier.isStatic(modifiers4) && Intrinsics.areEqual(method4.getName(), "setOption") && method4.getParameterTypes().length == 2 && Intrinsics.areEqual(method4.getReturnType(), cls3) && Intrinsics.areEqual(method4.getParameterTypes()[0], SocketOption.class) && Intrinsics.areEqual(method4.getParameterTypes()[1], Object.class)) {
                    method3 = method4;
                    break;
                }
            }
        } catch (Throwable unused4) {
        }
        f296325e = method3;
    }

    private r0() {
    }

    private final Object d(String str) throws IOException {
        Object obj;
        Field field = f296322b.get(str);
        if (field != null && (obj = field.get(null)) != null) {
            return obj;
        }
        throw new IOException("Socket option " + str + " is not supported");
    }

    public final void a(@NotNull DatagramChannel channel) throws IllegalAccessException, IOException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Object objD = d("SO_REUSEPORT");
        Method method = f296325e;
        Intrinsics.checkNotNull(method);
        method.invoke(channel, objD, Boolean.TRUE);
    }

    public final void b(@NotNull ServerSocketChannel channel) throws IllegalAccessException, IOException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Object objD = d("SO_REUSEPORT");
        Method method = f296324d;
        Intrinsics.checkNotNull(method);
        method.invoke(channel, objD, Boolean.TRUE);
    }

    public final void c(@NotNull SocketChannel channel) throws IllegalAccessException, IOException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Object objD = d("SO_REUSEPORT");
        Method method = f296323c;
        Intrinsics.checkNotNull(method);
        method.invoke(channel, objD, Boolean.TRUE);
    }
}
