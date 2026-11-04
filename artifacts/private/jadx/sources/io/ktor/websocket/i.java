package io.ktor.websocket;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nFrameType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameType.kt\nio/ktor/websocket/FrameType\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n1999#2,14:67\n669#2,11:81\n*S KotlinDebug\n*F\n+ 1 FrameType.kt\nio/ktor/websocket/FrameType\n*L\n52#1:67,14\n54#1:81,11\n*E\n"})
public enum i {
    TEXT(false, 1),
    BINARY(false, 2),
    CLOSE(true, 8),
    PING(true, 9),
    PONG(true, 10);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f297298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final i[] f297299e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f297307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f297308b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f297306l = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f297297c = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final i a(int i10) {
            if (i10 < 0 || i10 > i.f297298d) {
                return null;
            }
            return i.f297299e[i10];
        }

        private a() {
        }
    }

    static {
        i next;
        Iterator<i> it = p().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int i10 = next.f297308b;
                do {
                    i next2 = it.next();
                    int i11 = next2.f297308b;
                    if (i10 < i11) {
                        next = next2;
                        i10 = i11;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Intrinsics.checkNotNull(next);
        int i12 = next.f297308b;
        f297298d = i12;
        int i13 = i12 + 1;
        i[] iVarArr = new i[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            Iterator<i> it2 = p().iterator();
            i iVar = null;
            boolean z10 = false;
            while (true) {
                if (!it2.hasNext()) {
                    if (z10) {
                        break;
                    }
                } else {
                    i next3 = it2.next();
                    if (next3.f297308b == i14) {
                        if (!z10) {
                            z10 = true;
                            iVar = next3;
                        }
                    }
                }
                iVar = null;
                break;
            }
            iVarArr[i14] = iVar;
        }
        f297299e = iVarArr;
    }

    i(boolean z10, int i10) {
        this.f297307a = z10;
        this.f297308b = i10;
    }

    @NotNull
    public static kotlin.enums.a<i> p() {
        return f297306l;
    }

    public final boolean o() {
        return this.f297307a;
    }

    public final int q() {
        return this.f297308b;
    }
}
