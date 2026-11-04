package com.planner5d.library.services.utility;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nContractUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContractUtils.kt\ncom/planner5d/library/services/utility/ContractUtils\n*L\n1#1,26:1\n22#1,2:27\n22#1,2:29\n*S KotlinDebug\n*F\n+ 1 ContractUtils.kt\ncom/planner5d/library/services/utility/ContractUtils\n*L\n15#1:27,2\n18#1:29,2\n*E\n"})
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final p f229694a = new p();

    private p() {
    }

    public final /* synthetic */ <T> T a(Context context) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(context, "<this>");
        T t10 = (T) context.getApplicationContext();
        Intrinsics.reifiedOperationMarker(2, androidx.exifinterface.media.a.f51379e5);
        if (t10 != null) {
            return t10;
        }
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        throw new IllegalStateException("The " + kotlin.jvm.internal.j1.d(Object.class).Q() + " implementation is not available");
    }

    public final /* synthetic */ <T> T b(View view) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        T t10 = (T) context.getApplicationContext();
        Intrinsics.reifiedOperationMarker(2, androidx.exifinterface.media.a.f51379e5);
        if (t10 != null) {
            return t10;
        }
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        throw new IllegalStateException("The " + kotlin.jvm.internal.j1.d(Object.class).Q() + " implementation is not available");
    }

    public final /* synthetic */ <T> T c(Fragment fragment) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Context contextRequireContext = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        T t10 = (T) contextRequireContext.getApplicationContext();
        Intrinsics.reifiedOperationMarker(2, androidx.exifinterface.media.a.f51379e5);
        if (t10 != null) {
            return t10;
        }
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        throw new IllegalStateException("The " + kotlin.jvm.internal.j1.d(Object.class).Q() + " implementation is not available");
    }
}
