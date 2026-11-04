package com.planner5d.library.engine.rendering.util;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public enum f {
    Center,
    TopLeft,
    TopRight,
    BottomLeft,
    BottomRight;


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f165372h = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f165365a = new a(null);

    @SourceDebugExtension({"SMAP\nTextureTiling.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextureTiling.kt\ncom/planner5d/library/engine/rendering/util/TextureAlignment$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,24:1\n295#2,2:25\n*S KotlinDebug\n*F\n+ 1 TextureTiling.kt\ncom/planner5d/library/engine/rendering/util/TextureAlignment$Companion\n*L\n21#1:25,2\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @n
        @NotNull
        public final f a(@Nullable String str) {
            f next;
            Iterator<f> it = f.n().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(next.name(), str));
            f fVar = next;
            return fVar == null ? f.Center : fVar;
        }

        private a() {
        }
    }

    @n
    @NotNull
    public static final f l(@Nullable String str) {
        return f165365a.a(str);
    }

    @NotNull
    public static kotlin.enums.a<f> n() {
        return f165372h;
    }
}
