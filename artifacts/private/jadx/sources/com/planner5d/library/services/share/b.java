package com.planner5d.library.services.share;

import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import androidx.core.content.d;
import androidx.media3.common.j;
import com.facebook.AccessToken;
import com.planner5d.library.model.manager.statistics.events.a1;
import com.planner5d.library.model.manager.statistics.events.b2;
import com.planner5d.library.model.manager.statistics.events.b4;
import com.planner5d.library.model.manager.statistics.events.j1;
import com.planner5d.library.model.manager.statistics.events.p3;
import com.planner5d.library.model.manager.statistics.events.q3;
import com.planner5d.library.model.manager.statistics.events.r3;
import com.planner5d.library.model.manager.statistics.events.u2;
import com.planner5d.library.model.manager.statistics.events.x3;
import com.planner5d.library.services.r;
import java.io.Serializable;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nShareReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareReceiver.kt\ncom/planner5d/library/services/share/ShareReceiver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
public final class b extends BroadcastReceiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private static Application f224984c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f224982a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Object f224983b = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f224985d = 8;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f224986a;

        static {
            int[] iArr = new int[r3.l.values().length];
            try {
                iArr[r3.l.project.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r3.l.snapshot.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r3.l.article.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f224986a = iArr;
        }
    }

    private b() {
    }

    private final String b(Activity activity) {
        return activity.getApplication().getPackageName() + "/" + b.class.getName() + "_ACTION";
    }

    private final r3.j c(String str) {
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = str.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (StringsKt.V2(lowerCase, AccessToken.f98376v, false, 2, null)) {
            return r3.j.facebook;
        }
        if (StringsKt.V2(lowerCase, "sendtexttoclipboardactivity", false, 2, null)) {
            return r3.j.copy;
        }
        return StringsKt.V2(lowerCase, "email", false, 2, null) ? r3.j.email : r3.j.other;
    }

    private final void d(Activity activity) {
        synchronized (f224983b) {
            try {
                b bVar = f224982a;
                bVar.e();
                Application application = activity.getApplication();
                d.w(application, bVar, new IntentFilter(bVar.b(activity)), 4);
                f224984c = application;
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void e() {
        synchronized (f224983b) {
            try {
                Application application = f224984c;
                if (application != null) {
                    application.unregisterReceiver(f224982a);
                }
                f224984c = null;
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    public final IntentSender a(@NotNull Activity activity, @Nullable r3.k kVar, @NotNull r3.l type, @Nullable Long l10, @Nullable jc.b bVar, @Nullable q3.d dVar) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(type, "type");
        Intent intent = new Intent(b(activity));
        if (kVar != null) {
            intent.putExtra(r.sharedSource.f224891a, kVar.name());
        }
        intent.putExtra(r.sharedType.f224891a, type.name());
        intent.putExtra(r.projectId.f224891a, l10);
        intent.putExtra(r.articleId.f224891a, bVar != null ? bVar.c() : null);
        intent.putExtra(r.category.f224891a, bVar != null ? bVar.a() : null);
        intent.putExtra(r.source.f224891a, dVar);
        intent.setPackage(activity.getPackageName());
        f224982a.d(activity);
        Unit unit = Unit.f312394a;
        IntentSender intentSender = PendingIntent.getBroadcast(activity, 6, intent, Build.VERSION.SDK_INT >= 31 ? 167772160 : j.W0).getIntentSender();
        Intrinsics.checkNotNullExpressionValue(intentSender, "getIntentSender(...)");
        return intentSender;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        Bundle extras;
        Object obj;
        String string;
        r3.l lVarValueOf;
        e();
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        if (!extras.containsKey("android.intent.extra.CHOSEN_COMPONENT")) {
            extras = null;
        }
        if (extras == null || (obj = extras.get("android.intent.extra.CHOSEN_COMPONENT")) == null || (string = obj.toString()) == null) {
            return;
        }
        Serializable serializableExtra = intent.getSerializableExtra(r.source.f224891a);
        r3.j jVarC = f224982a.c(string);
        String stringExtra = intent.getStringExtra(r.sharedSource.f224891a);
        r3.k kVarValueOf = stringExtra != null ? r3.k.valueOf(stringExtra) : null;
        String stringExtra2 = intent.getStringExtra(r.sharedType.f224891a);
        if (stringExtra2 == null || (lVarValueOf = r3.l.valueOf(stringExtra2)) == null) {
            return;
        }
        r rVar = r.projectId;
        Intent intent2 = intent.hasExtra(rVar.f224891a) ? intent : null;
        Long lValueOf = intent2 != null ? Long.valueOf(intent2.getLongExtra(rVar.f224891a, 0L)) : null;
        int i10 = a.f224986a[lVarValueOf.ordinal()];
        if (i10 == 1) {
            b2.f216725b.u0(x3.a.share, p3.b.success, lValueOf);
        } else if (i10 == 2) {
            u2.E1(b4.a.share, p3.b.success, lValueOf, serializableExtra instanceof b4.c ? (b4.c) serializableExtra : null, null, 16, null);
        } else if (i10 == 3) {
            r rVar2 = r.articleId;
            Intent intent3 = intent.hasExtra(rVar2.f224891a) ? intent : null;
            Integer numValueOf = intent3 != null ? Integer.valueOf(intent3.getIntExtra(rVar2.f224891a, 0)) : null;
            r rVar3 = r.category;
            if (!intent.hasExtra(rVar3.f224891a)) {
                intent = null;
            }
            Integer numValueOf2 = intent != null ? Integer.valueOf(intent.getIntExtra(rVar3.f224891a, 0)) : null;
            a1 a1Var = a1.f216679b;
            a1Var.d1(q3.a.share, a1Var.A0(numValueOf2), numValueOf, serializableExtra instanceof q3.d ? (q3.d) serializableExtra : null, jVarC.toString());
        }
        j1.f216988b.q0(kVarValueOf, lVarValueOf, jVarC, string);
    }
}
