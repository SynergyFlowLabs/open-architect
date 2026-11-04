package com.planner5d.library.activity.fragment.dialog.authentication;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nNotifyingAnimationDrawable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotifyingAnimationDrawable.kt\ncom/planner5d/library/activity/fragment/dialog/authentication/NotifyingAnimationDrawable\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,46:1\n1863#2,2:47\n11195#3:49\n11530#3,3:50\n*S KotlinDebug\n*F\n+ 1 NotifyingAnimationDrawable.kt\ncom/planner5d/library/activity/fragment/dialog/authentication/NotifyingAnimationDrawable\n*L\n24#1:47,2\n14#1:49\n14#1:50,3\n*E\n"})
public final class m1 extends AnimationDrawable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f131820c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<Drawable> f131821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private a f131822b;

    public interface a {
        void a(int i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m1(int i10, @NotNull List<? extends Drawable> drawables) {
        Intrinsics.checkNotNullParameter(drawables, "drawables");
        this.f131821a = drawables;
        Iterator it = drawables.iterator();
        while (it.hasNext()) {
            addFrame((Drawable) it.next(), i10);
        }
        setOneShot(false);
    }

    public final int a() {
        return this.f131821a.size();
    }

    public final void d(@NotNull a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f131822b = listener;
    }

    @Override // android.graphics.drawable.DrawableContainer
    public boolean selectDrawable(int i10) {
        boolean zSelectDrawable = super.selectDrawable(i10);
        a aVar = this.f131822b;
        if (aVar != null) {
            aVar.a(i10);
        }
        return zSelectDrawable;
    }

    public m1(@NotNull Context context, @androidx.annotation.h0 int i10, @androidx.annotation.v @NotNull int... drawables) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(drawables, "drawables");
        int integer = context.getResources().getInteger(i10);
        ArrayList arrayList = new ArrayList(drawables.length);
        for (int i11 : drawables) {
            arrayList.add(androidx.core.content.d.l(context, i11));
        }
        this(integer, CollectionsKt.filterNotNull(arrayList));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m1(@NotNull Context context, @androidx.annotation.h0 int i10, @NotNull List<? extends Drawable> drawables) {
        this(context.getResources().getInteger(i10), drawables);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(drawables, "drawables");
    }
}
