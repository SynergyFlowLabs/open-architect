package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import io.sentry.android.core.SentryAndroidOptions;
import java.util.LinkedList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f304241a = new int[2];

    @Nullable
    static io.sentry.internal.gestures.b a(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull View view, float f10, float f11, io.sentry.internal.gestures.b.a aVar) {
        List<io.sentry.internal.gestures.a> gestureTargetLocators = sentryAndroidOptions.getGestureTargetLocators();
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        io.sentry.internal.gestures.b bVar = null;
        while (linkedList.size() > 0) {
            View view2 = (View) linkedList.poll();
            if (e(view2, f10, f11)) {
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                        linkedList.add(viewGroup.getChildAt(i10));
                    }
                }
                for (int i11 = 0; i11 < gestureTargetLocators.size(); i11++) {
                    io.sentry.internal.gestures.b bVarA = gestureTargetLocators.get(i11).a(view2, f10, f11, aVar);
                    if (bVarA != null) {
                        if (aVar == io.sentry.internal.gestures.b.a.CLICKABLE) {
                            bVar = bVarA;
                        } else if (aVar == io.sentry.internal.gestures.b.a.SCROLLABLE) {
                            return bVarA;
                        }
                    }
                }
            }
        }
        return bVar;
    }

    public static String b(@NotNull View view) throws Resources.NotFoundException {
        int id2 = view.getId();
        if (id2 == -1 || d(id2)) {
            throw new Resources.NotFoundException();
        }
        Resources resources = view.getContext().getResources();
        return resources != null ? resources.getResourceEntryName(id2) : "";
    }

    static String c(@NotNull View view) {
        try {
            return b(view);
        } catch (Resources.NotFoundException unused) {
            return "0x" + Integer.toString(view.getId(), 16);
        }
    }

    private static boolean d(int i10) {
        return ((-16777216) & i10) == 0 && (i10 & 16777215) != 0;
    }

    private static boolean e(@Nullable View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        int[] iArr = f304241a;
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        return f10 >= ((float) i10) && f10 <= ((float) (i10 + view.getWidth())) && f11 >= ((float) i11) && f11 <= ((float) (i11 + view.getHeight()));
    }
}
