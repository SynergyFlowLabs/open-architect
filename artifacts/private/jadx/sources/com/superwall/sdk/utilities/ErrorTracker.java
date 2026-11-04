package com.superwall.sdk.utilities;

import com.superwall.sdk.BuildConfig;
import com.superwall.sdk.Superwall;
import com.superwall.sdk.analytics.internal.TrackingKt;
import com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent;
import com.superwall.sdk.storage.ErrorLog;
import com.superwall.sdk.storage.LocalStorage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p;
import kotlin.text.StringsKt;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nErrorTracking.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErrorTracking.kt\ncom/superwall/sdk/utilities/ErrorTracker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,156:1\n1557#2:157\n1628#2,2:158\n1630#2:164\n975#3:160\n1046#3,3:161\n12574#4,2:165\n*S KotlinDebug\n*F\n+ 1 ErrorTracking.kt\ncom/superwall/sdk/utilities/ErrorTracker\n*L\n76#1:157\n76#1:158,2\n76#1:164\n94#1:160\n94#1:161,3\n98#1:165,2\n*E\n"})
public final class ErrorTracker implements ErrorTracking {

    @NotNull
    private final LocalStorage cache;

    @NotNull
    private final Function2<InternalSuperwallEvent.ErrorThrown, d<? super Unit>, Object> track;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.superwall.sdk.utilities.ErrorTracker$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.utilities.ErrorTracker$1", f = "ErrorTracking.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends o implements Function2<InternalSuperwallEvent.ErrorThrown, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternalSuperwallEvent.ErrorThrown errorThrown, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(errorThrown, dVar)).invokeSuspend(Unit.f312394a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                InternalSuperwallEvent.ErrorThrown errorThrown = (InternalSuperwallEvent.ErrorThrown) this.L$0;
                Superwall companion = Superwall.Companion.getInstance();
                this.label = 1;
                if (TrackingKt.track(companion, errorThrown, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                ((Result) obj).j();
            }
            return Unit.f312394a;
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.utilities.ErrorTracker$2, reason: invalid class name */
    @f(c = "com.superwall.sdk.utilities.ErrorTracker$2", f = "ErrorTracking.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ ErrorTracking.ErrorOccurence $exists;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ErrorTracking.ErrorOccurence errorOccurence, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$exists = errorOccurence;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return ErrorTracker.this.new AnonymousClass2(this.$exists, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                Function2 function2 = ErrorTracker.this.track;
                InternalSuperwallEvent.ErrorThrown errorThrown = new InternalSuperwallEvent.ErrorThrown(this.$exists.getMessage(), this.$exists.getStacktrace(), this.$exists.getTimestamp(), this.$exists.getType(), this.$exists.isFatal());
                this.label = 1;
                if (function2.invoke(errorThrown, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            ErrorTracker.this.cache.delete(ErrorLog.INSTANCE);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ErrorTracker(@NotNull s0 scope, @NotNull LocalStorage cache, @NotNull Function2<? super InternalSuperwallEvent.ErrorThrown, ? super d<? super Unit>, ? extends Object> track) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(track, "track");
        this.cache = cache;
        this.track = track;
        ErrorTracking.ErrorOccurence errorOccurence = (ErrorTracking.ErrorOccurence) cache.read(ErrorLog.INSTANCE);
        if (errorOccurence != null) {
            k.f(scope, null, null, new AnonymousClass2(errorOccurence, null), 3, null);
        }
    }

    public final boolean containsAny(@NotNull String str, @NotNull String... strings) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(strings, "strings");
        for (String str2 : strings) {
            if (StringsKt.V2(str, str2, false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.superwall.sdk.utilities.ErrorTracker] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    @NotNull
    public final String replaceNonSuperwallPackages(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        List<String> listM3 = StringsKt.M3(str);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM3, 10));
        Iterator it = listM3.iterator();
        while (it.hasNext()) {
            ?? r10 = (String) it.next();
            if (!containsAny(r10, BuildConfig.LIBRARY_PACKAGE_NAME, "com.superwall.supercel", "java.lang", "net.java.dev.jna", "kotlin.", "kotlinx.", "android.os", "androidx.os", "com.android.", "com.google.", "org.threeten.", "com.revenuecat.purchases")) {
                ArrayList arrayList2 = new ArrayList(r10.length());
                for (int i10 = 0; i10 < r10.length(); i10++) {
                    char cCharAt = r10.charAt(i10);
                    arrayList2.add(Character.isLetter(cCharAt) ? "*" : Character.valueOf(cCharAt));
                }
                r10 = arrayList2;
            }
            arrayList.add(r10);
        }
        return CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, null, 62, null);
    }

    @Override // com.superwall.sdk.utilities.ErrorTracking
    public void trackError(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        String message = throwable.getMessage();
        if (message == null) {
            message = "";
        }
        String strReplaceNonSuperwallPackages = replaceNonSuperwallPackages(p.i(throwable));
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zIsFatal = ErrorTrackingKt.isFatal(throwable);
        String simpleName = throwable.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        this.cache.write(ErrorLog.INSTANCE, new ErrorTracking.ErrorOccurence(simpleName, message, strReplaceNonSuperwallPackages, jCurrentTimeMillis, zIsFatal));
    }

    public /* synthetic */ ErrorTracker(s0 s0Var, LocalStorage localStorage, Function2 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(s0Var, localStorage, (i10 & 4) != 0 ? new AnonymousClass1(null) : function2);
    }
}
