package com.superwall.sdk.misc;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class AlertControllerFactory {

    @NotNull
    public static final AlertControllerFactory INSTANCE = new AlertControllerFactory();

    private AlertControllerFactory() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AlertDialog make$default(AlertControllerFactory alertControllerFactory, Context context, String str, String str2, String str3, String str4, Function0 function0, Function0 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        if ((i10 & 16) != 0) {
            str4 = "Done";
        }
        if ((i10 & 32) != 0) {
            function0 = null;
        }
        if ((i10 & 64) != 0) {
            function1 = null;
        }
        return alertControllerFactory.make(context, str, str2, str3, str4, function0, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void make$lambda$0(Function0 function0, DialogInterface dialogInterface, int i10) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void make$lambda$1(Function0 function0, DialogInterface dialogInterface, int i10) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    @NotNull
    public final AlertDialog make(@NotNull Context context, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String closeActionTitle, @Nullable final Function0<Unit> function0, @Nullable final Function0<Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(closeActionTitle, "closeActionTitle");
        AlertDialog.Builder message = new AlertDialog.Builder(context).setTitle(str).setMessage(str2);
        if (str3 != null) {
            message.setPositiveButton(str3, new DialogInterface.OnClickListener() { // from class: com.superwall.sdk.misc.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    AlertControllerFactory.make$lambda$0(function0, dialogInterface, i10);
                }
            });
        }
        message.setNegativeButton(closeActionTitle, new DialogInterface.OnClickListener() { // from class: com.superwall.sdk.misc.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                AlertControllerFactory.make$lambda$1(function1, dialogInterface, i10);
            }
        });
        AlertDialog alertDialogCreate = message.create();
        Intrinsics.checkNotNullExpressionValue(alertDialogCreate, "create(...)");
        return alertDialogCreate;
    }
}
