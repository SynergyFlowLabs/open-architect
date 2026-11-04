package com.planner5d.library.activity.fragment.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.fragment.dialog.SimpleOptionSelectionDialog.b;
import com.planner5d.library.services.utility.k3;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 4)
@SourceDebugExtension({"SMAP\nSimpleOptionSelectionDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleOptionSelectionDialog.kt\ncom/planner5d/library/activity/fragment/dialog/SimpleOptionSelectionDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,39:1\n1557#2:40\n1628#2,3:41\n37#3,2:44\n*S KotlinDebug\n*F\n+ 1 SimpleOptionSelectionDialog.kt\ncom/planner5d/library/activity/fragment/dialog/SimpleOptionSelectionDialog\n*L\n32#1:40\n32#1:41,3\n32#1:44,2\n*E\n"})
public abstract class SimpleOptionSelectionDialog<T extends Serializable, O extends b<T>> extends androidx.fragment.app.m {
    public static final int $stable = 0;

    @w0(parameters = 0)
    public static final class a<T extends Serializable> implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f131648c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final k3 f131649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final T f131650b;

        public a(@NotNull k3 title, @NotNull T value) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f131649a = title;
            this.f131650b = value;
        }

        @NotNull
        public final k3 a() {
            return this.f131649a;
        }

        @NotNull
        public final T b() {
            return this.f131650b;
        }
    }

    @w0(parameters = 0)
    public static abstract class b<T extends Serializable> implements Serializable, Iterable<a<T>>, qj.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f131651b = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final a<T>[] f131652a;

        public b(@NotNull a<T>[] options) {
            Intrinsics.checkNotNullParameter(options, "options");
            this.f131652a = options;
        }

        @NotNull
        public final a<T> c(int i10) {
            return this.f131652a[i10];
        }

        @Override // java.lang.Iterable
        @NotNull
        public Iterator<a<T>> iterator() {
            return kotlin.jvm.internal.i.a(this.f131652a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void C(SimpleOptionSelectionDialog simpleOptionSelectionDialog, b bVar, DialogInterface dialogInterface, int i10) {
        simpleOptionSelectionDialog.D(bVar.c(i10).b());
    }

    @NotNull
    protected abstract O B() throws IllegalStateException;

    protected abstract void D(@NotNull T t10);

    @Override // androidx.fragment.app.m
    @NotNull
    public android.app.Dialog onCreateDialog(@Nullable Bundle bundle) {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        final b bVarB = B();
        androidx.appcompat.app.c.a aVar = new androidx.appcompat.app.c.a(contextRequireContext);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(bVarB, 10));
        Iterator<a<T>> it = bVarB.iterator();
        while (it.hasNext()) {
            arrayList.add(((a) it.next()).a().i(contextRequireContext));
        }
        androidx.appcompat.app.c cVarCreate = aVar.setItems((CharSequence[]) arrayList.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.m0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                SimpleOptionSelectionDialog.C(this.f132134a, bVarB, dialogInterface, i10);
            }
        }).create();
        Intrinsics.checkNotNullExpressionValue(cVarCreate, "create(...)");
        return cVarCreate;
    }
}
