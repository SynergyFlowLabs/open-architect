package com.planner5d.library.engine.rendering.util;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public enum i {
    NoRepeat,
    RepeatX,
    RepeatY,
    RepeatXY,
    Repeat2X2Y;


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f165385h = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f165378a = new a(null);

    @SourceDebugExtension({"SMAP\nTextureTiling.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextureTiling.kt\ncom/planner5d/library/engine/rendering/util/TextureRepeat$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,24:1\n295#2,2:25\n*S KotlinDebug\n*F\n+ 1 TextureTiling.kt\ncom/planner5d/library/engine/rendering/util/TextureRepeat$Companion\n*L\n11#1:25,2\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @n
        @NotNull
        public final i a(@Nullable String str) {
            i next;
            Iterator<i> it = i.n().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(next.name(), str));
            i iVar = next;
            return iVar == null ? i.RepeatXY : iVar;
        }

        private a() {
        }
    }

    @n
    @NotNull
    public static final i l(@Nullable String str) {
        return f165378a.a(str);
    }

    @NotNull
    public static kotlin.enums.a<i> n() {
        return f165385h;
    }
}
