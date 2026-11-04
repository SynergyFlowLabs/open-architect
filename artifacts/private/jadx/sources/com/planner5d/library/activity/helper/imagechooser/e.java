package com.planner5d.library.activity.helper.imagechooser;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import android.util.Pair;
import androidx.annotation.l0;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.utility.o0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.Scheduler;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nContentRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentRequester.kt\ncom/planner5d/library/activity/helper/imagechooser/ContentRequester\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,109:1\n37#2,2:110\n*S KotlinDebug\n*F\n+ 1 ContentRequester.kt\ncom/planner5d/library/activity/helper/imagechooser/ContentRequester\n*L\n53#1:110,2\n*E\n"})
public class e<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f136943b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Uri f136944a;

    private final <F, S> F e(Pair<F, S> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return (F) pair.first;
    }

    private final <F, S> S f(Pair<F, S> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return (S) pair.second;
    }

    private final List<Intent> h(Uri uri, Activity activity) {
        PackageManager packageManager;
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (activity != null && (packageManager = activity.getPackageManager()) != null) {
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                Intent intent2 = new Intent(intent);
                intent2.putExtra("output", uri);
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                arrayList.add(intent2);
            }
        }
        return arrayList;
    }

    @l0
    private final Pair<Integer, Intent> i(qa.e eVar, IntentSender intentSender, Activity activity) {
        String[] strArrC = eVar.c();
        Intent action = new Intent().setType(String.join("|", (CharSequence[]) Arrays.copyOf(strArrC, strArrC.length))).putExtra("android.intent.extra.MIME_TYPES", strArrC).setAction("android.intent.action.GET_CONTENT");
        Intrinsics.checkNotNullExpressionValue(action, "setAction(...)");
        return new Pair<>(Integer.valueOf(activity.getPackageManager().queryIntentActivities(action, 0).size()), Intent.createChooser(action, "", intentSender));
    }

    private final Observable<Intent> j(final qa.e eVar, final IntentSender intentSender, final Activity activity) {
        if (activity == null) {
            timber.log.b.f381052a.x("attempt to request file on empty activity", new Object[0]);
            Observable<Intent> observableEmpty = Observable.empty();
            Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
            return observableEmpty;
        }
        Observable observableF = com.planner5d.library.services.rx.i.f(new Callable() { // from class: com.planner5d.library.activity.helper.imagechooser.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return e.k(this.f136935a, eVar, intentSender, activity);
            }
        });
        Scheduler scheduler = com.planner5d.library.services.rx.c.f224934d;
        Observable<T> observableObserveOn = observableF.subscribeOn(scheduler).observeOn(com.planner5d.library.services.rx.c.f224933c);
        final Function1 function1 = new Function1() { // from class: com.planner5d.library.activity.helper.imagechooser.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.l(this.f136939a, activity, eVar, (Pair) obj);
            }
        };
        Observable<Intent> observableObserveOn2 = observableObserveOn.map(new Func1() { // from class: com.planner5d.library.activity.helper.imagechooser.d
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return e.m(function1, obj);
            }
        }).observeOn(scheduler);
        Intrinsics.checkNotNullExpressionValue(observableObserveOn2, "observeOn(...)");
        return observableObserveOn2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair k(e eVar, qa.e eVar2, IntentSender intentSender, Activity activity) {
        return eVar.i(eVar2, intentSender, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent l(e eVar, Activity activity, qa.e eVar2, Pair pair) {
        Uri uriA;
        Uri uri;
        Intrinsics.checkNotNull(pair);
        int iIntValue = ((Number) eVar.e(pair)).intValue();
        Intent intent = (Intent) eVar.f(pair);
        try {
            uriA = o0.f225339a.a(activity);
        } catch (IOException unused) {
            uriA = null;
        }
        eVar.f136944a = uriA;
        if (eVar2.a() && (uri = eVar.f136944a) != null) {
            List<Intent> listH = eVar.h(uri, activity);
            if (iIntValue == 0 && listH.size() == 1) {
                return listH.get(0);
            }
            intent.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) listH.toArray(new Parcelable[0]));
        }
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent m(Function1 function1, Object obj) {
        return (Intent) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable o(Function1 function1, Object obj) {
        return (Observable) function1.invoke(obj);
    }

    @Nullable
    protected final Uri g(@NotNull Pair<Integer, Intent> result) {
        Intrinsics.checkNotNullParameter(result, "result");
        Object obj = result.second;
        if (obj != null) {
            Intent intent = (Intent) obj;
            int i10 = 2 & 0;
            if ((intent != null ? intent.getData() : null) != null) {
                Intent intent2 = (Intent) result.second;
                String action = intent2 != null ? intent2.getAction() : null;
                if (action == null || !Intrinsics.areEqual(action, "android.media.action.IMAGE_CAPTURE")) {
                    Intent intent3 = (Intent) result.second;
                    if (intent3 != null) {
                        return intent3.getData();
                    }
                    return null;
                }
            }
        }
        return this.f136944a;
    }

    @NotNull
    protected final Observable<T> n(@NotNull qa.e strategy, @Nullable IntentSender intentSender, @Nullable Activity activity, @NotNull final Function1<? super Intent, ? extends Observable<T>> mapper) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Observable<T> observable = (Observable<T>) j(strategy, intentSender, activity).flatMap(new Func1() { // from class: com.planner5d.library.activity.helper.imagechooser.a
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return e.o(mapper, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observable, "flatMap(...)");
        return observable;
    }
}
