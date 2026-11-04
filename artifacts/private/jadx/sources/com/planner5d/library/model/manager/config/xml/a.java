package com.planner5d.library.model.manager.config.xml;

import android.content.SharedPreferences;
import androidx.annotation.m1;
import com.planner5d.library.services.utility.c0;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.b1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@ij.f
@SourceDebugExtension({"SMAP\nXmlSharedPreferencesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,221:1\n218#1:222\n218#1:223\n218#1:224\n218#1:225\n218#1:226\n218#1:227\n218#1:228\n218#1:229\n218#1:230\n218#1:271\n218#1:272\n218#1:273\n218#1:274\n218#1:275\n218#1:276\n218#1:277\n218#1:286\n45#2,8:231\n45#2,8:239\n45#2,8:247\n45#2,8:255\n45#2,8:263\n45#2,8:278\n45#2,8:287\n*S KotlinDebug\n*F\n+ 1 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager\n*L\n35#1:222\n46#1:223\n48#1:224\n51#1:225\n54#1:226\n78#1:227\n86#1:228\n94#1:229\n97#1:230\n153#1:271\n159#1:272\n165#1:273\n171#1:274\n176#1:275\n181#1:276\n195#1:277\n205#1:286\n110#1:231,8\n121#1:239,8\n132#1:247,8\n143#1:255,8\n149#1:263,8\n201#1:278,8\n212#1:287,8\n*E\n"})
public final class a implements com.planner5d.library.model.manager.config.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f190894a;

    /* JADX INFO: renamed from: com.planner5d.library.model.manager.config.xml.a$a, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.xml.XmlSharedPreferencesManager$clear$$inlined$execute$1", f = "XmlSharedPreferencesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nXmlSharedPreferencesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager$execute$2\n+ 2 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager\n*L\n1#1,218:1\n205#2:219\n*E\n"})
    public static final class C1588a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f190896b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1588a(kotlin.coroutines.d dVar, a aVar) {
            super(2, dVar);
            this.f190896b = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C1588a(dVar, this.f190896b);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190895a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            this.f190896b.K();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C1588a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.xml.XmlSharedPreferencesManager$contains$$inlined$execute$1", f = "XmlSharedPreferencesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nXmlSharedPreferencesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager$execute$2\n+ 2 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager\n*L\n1#1,218:1\n195#2:219\n*E\n"})
    public static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f190898b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f190899c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlin.coroutines.d dVar, a aVar, String str) {
            super(2, dVar);
            this.f190898b = aVar;
            this.f190899c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(dVar, this.f190898b, this.f190899c);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190897a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return kotlin.coroutines.jvm.internal.b.a(this.f190898b.S().contains(this.f190899c));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.xml.XmlSharedPreferencesManager$execute$2", f = "XmlSharedPreferencesManager.kt", i = {}, l = {218}, m = "invokeSuspend", n = {}, s = {})
    public static final class c<T> extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super T>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super T>, Object> f190901b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f190901b = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f190901b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f190900a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            Function1<kotlin.coroutines.d<? super T>, Object> function1 = this.f190901b;
            this.f190900a = 1;
            Object objInvoke = function1.invoke(this);
            return objInvoke == objL ? objL : objInvoke;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            return this.f190901b.invoke(this);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super T> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.xml.XmlSharedPreferencesManager$get$$inlined$execute$1", f = "XmlSharedPreferencesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nXmlSharedPreferencesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager$execute$2\n+ 2 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager\n*L\n1#1,218:1\n36#2,8:219\n*E\n"})
    public static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super JSONObject>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f190903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.r f190904c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kotlin.coroutines.d dVar, a aVar, com.planner5d.library.services.r rVar) {
            super(2, dVar);
            this.f190903b = aVar;
            this.f190904c = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(dVar, this.f190903b, this.f190904c);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0033  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            JSONObject jSONObject;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190902a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            String string = this.f190903b.S().getString(this.f190904c.f224891a, "{}");
            if (string != null) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException e10) {
                    timber.log.b.f381052a.e(e10);
                    jSONObject = null;
                }
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
            } else {
                jSONObject = new JSONObject();
            }
            return jSONObject;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super JSONObject> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.xml.XmlSharedPreferencesManager$get$$inlined$execute$2", f = "XmlSharedPreferencesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nXmlSharedPreferencesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager$execute$2\n+ 2 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager\n*L\n1#1,218:1\n46#2:219\n*E\n"})
    public static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Integer>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f190906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.r f190907c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f190908d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(kotlin.coroutines.d dVar, a aVar, com.planner5d.library.services.r rVar, int i10) {
            super(2, dVar);
            this.f190906b = aVar;
            this.f190907c = rVar;
            this.f190908d = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new e(dVar, this.f190906b, this.f190907c, this.f190908d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190905a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return kotlin.coroutines.jvm.internal.b.f(this.f190906b.S().getInt(this.f190907c.f224891a, this.f190908d));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Integer> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.xml.XmlSharedPreferencesManager$get$$inlined$execute$3", f = "XmlSharedPreferencesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nXmlSharedPreferencesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager$execute$2\n+ 2 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager\n*L\n1#1,218:1\n48#2:219\n*E\n"})
    public static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Long>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f190910b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.r f190911c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f190912d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(kotlin.coroutines.d dVar, a aVar, com.planner5d.library.services.r rVar, long j10) {
            super(2, dVar);
            this.f190910b = aVar;
            this.f190911c = rVar;
            this.f190912d = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new f(dVar, this.f190910b, this.f190911c, this.f190912d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190909a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return kotlin.coroutines.jvm.internal.b.g(this.f190910b.S().getLong(this.f190911c.f224891a, this.f190912d));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Long> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.xml.XmlSharedPreferencesManager$get$$inlined$execute$4", f = "XmlSharedPreferencesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nXmlSharedPreferencesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager$execute$2\n+ 2 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager\n*L\n1#1,218:1\n51#2:219\n*E\n"})
    public static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f190914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.r f190915c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f190916d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(kotlin.coroutines.d dVar, a aVar, com.planner5d.library.services.r rVar, boolean z10) {
            super(2, dVar);
            this.f190914b = aVar;
            this.f190915c = rVar;
            this.f190916d = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new g(dVar, this.f190914b, this.f190915c, this.f190916d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190913a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return kotlin.coroutines.jvm.internal.b.a(this.f190914b.S().getBoolean(this.f190915c.f224891a, this.f190916d));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.xml.XmlSharedPreferencesManager$get$$inlined$execute$5", f = "XmlSharedPreferencesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nXmlSharedPreferencesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager$execute$2\n+ 2 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager\n*L\n1#1,218:1\n54#2:219\n*E\n"})
    public static final class h extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f190918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f190919c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f190920d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(kotlin.coroutines.d dVar, a aVar, String str, boolean z10) {
            super(2, dVar);
            this.f190918b = aVar;
            this.f190919c = str;
            this.f190920d = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new h(dVar, this.f190918b, this.f190919c, this.f190920d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190917a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return kotlin.coroutines.jvm.internal.b.a(this.f190918b.S().getBoolean(this.f190919c, this.f190920d));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.xml.XmlSharedPreferencesManager$getAllKeys$$inlined$execute$1", f = "XmlSharedPreferencesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nXmlSharedPreferencesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager$execute$2\n+ 2 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager\n*L\n1#1,218:1\n94#2:219\n*E\n"})
    public static final class i extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Set<String>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f190922b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(kotlin.coroutines.d dVar, a aVar) {
            super(2, dVar);
            this.f190922b = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new i(dVar, this.f190922b);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190921a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return this.f190922b.S().getAll().keySet();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Set<String>> dVar) {
            return ((i) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.xml.XmlSharedPreferencesManager$getString$$inlined$execute$1", f = "XmlSharedPreferencesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nXmlSharedPreferencesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager$execute$2\n+ 2 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager\n*L\n1#1,218:1\n79#2:219\n*E\n"})
    public static final class j extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f190924b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f190925c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f190926d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(kotlin.coroutines.d dVar, a aVar, String str, String str2) {
            super(2, dVar);
            this.f190924b = aVar;
            this.f190925c = str;
            this.f190926d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new j(dVar, this.f190924b, this.f190925c, this.f190926d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190923a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return this.f190924b.S().getString(this.f190925c, this.f190926d);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super String> dVar) {
            return ((j) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.xml.XmlSharedPreferencesManager$getStringBlocking$1", f = "XmlSharedPreferencesManager.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190927a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.r f190929c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f190930d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(com.planner5d.library.services.r rVar, String str, kotlin.coroutines.d<? super k> dVar) {
            super(2, dVar);
            this.f190929c = rVar;
            this.f190930d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new k(this.f190929c, this.f190930d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f190927a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            a aVar = a.this;
            String str = this.f190929c.f224891a;
            String str2 = this.f190930d;
            this.f190927a = 1;
            Object objN = aVar.n(str, str2, this);
            return objN == objL ? objL : objN;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super String> dVar) {
            return ((k) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.xml.XmlSharedPreferencesManager$getStringSet$$inlined$execute$1", f = "XmlSharedPreferencesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nXmlSharedPreferencesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager$execute$2\n+ 2 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager\n*L\n1#1,218:1\n87#2:219\n*E\n"})
    public static final class l extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Set<? extends String>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f190932b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f190933c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Set f190934d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(kotlin.coroutines.d dVar, a aVar, String str, Set set) {
            super(2, dVar);
            this.f190932b = aVar;
            this.f190933c = str;
            this.f190934d = set;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new l(dVar, this.f190932b, this.f190933c, this.f190934d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190931a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            Set<String> stringSet = this.f190932b.S().getStringSet(this.f190933c, this.f190934d);
            return stringSet == null ? this.f190934d : stringSet;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Set<? extends String>> dVar) {
            return ((l) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.xml.XmlSharedPreferencesManager$set$$inlined$execute$1", f = "XmlSharedPreferencesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nXmlSharedPreferencesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager$execute$2\n+ 2 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager\n+ 3 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,218:1\n98#2:219\n99#2:228\n45#3,8:220\n*S KotlinDebug\n*F\n+ 1 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager\n*L\n98#1:220,8\n*E\n"})
    public static final class m extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190935a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f190936b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.r f190937c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ JSONObject f190938d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(kotlin.coroutines.d dVar, a aVar, com.planner5d.library.services.r rVar, JSONObject jSONObject) {
            super(2, dVar);
            this.f190936b = aVar;
            this.f190937c = rVar;
            this.f190938d = jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new m(dVar, this.f190936b, this.f190937c, this.f190938d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190935a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            SharedPreferences.Editor editorEdit = this.f190936b.S().edit();
            editorEdit.putString(this.f190937c.f224891a, this.f190938d.toString());
            editorEdit.commit();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((m) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.xml.XmlSharedPreferencesManager$set$$inlined$execute$2", f = "XmlSharedPreferencesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nXmlSharedPreferencesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager$execute$2\n+ 2 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager\n+ 3 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,218:1\n154#2:219\n155#2:228\n45#3,8:220\n*S KotlinDebug\n*F\n+ 1 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager\n*L\n154#1:220,8\n*E\n"})
    public static final class n extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f190940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f190941c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f190942d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(kotlin.coroutines.d dVar, a aVar, String str, String str2) {
            super(2, dVar);
            this.f190940b = aVar;
            this.f190941c = str;
            this.f190942d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new n(dVar, this.f190940b, this.f190941c, this.f190942d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190939a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            SharedPreferences.Editor editorEdit = this.f190940b.S().edit();
            editorEdit.putString(this.f190941c, this.f190942d);
            editorEdit.commit();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((n) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.xml.XmlSharedPreferencesManager$set$$inlined$execute$3", f = "XmlSharedPreferencesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nXmlSharedPreferencesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager$execute$2\n+ 2 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager\n+ 3 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,218:1\n160#2:219\n161#2:228\n45#3,8:220\n*S KotlinDebug\n*F\n+ 1 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager\n*L\n160#1:220,8\n*E\n"})
    public static final class o extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f190944b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.r f190945c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f190946d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(kotlin.coroutines.d dVar, a aVar, com.planner5d.library.services.r rVar, int i10) {
            super(2, dVar);
            this.f190944b = aVar;
            this.f190945c = rVar;
            this.f190946d = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new o(dVar, this.f190944b, this.f190945c, this.f190946d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190943a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            SharedPreferences.Editor editorEdit = this.f190944b.S().edit();
            editorEdit.putInt(this.f190945c.f224891a, this.f190946d);
            editorEdit.commit();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((o) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.xml.XmlSharedPreferencesManager$set$$inlined$execute$4", f = "XmlSharedPreferencesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nXmlSharedPreferencesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager$execute$2\n+ 2 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager\n+ 3 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,218:1\n166#2:219\n167#2:228\n45#3,8:220\n*S KotlinDebug\n*F\n+ 1 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager\n*L\n166#1:220,8\n*E\n"})
    public static final class p extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f190948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.r f190949c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f190950d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(kotlin.coroutines.d dVar, a aVar, com.planner5d.library.services.r rVar, long j10) {
            super(2, dVar);
            this.f190948b = aVar;
            this.f190949c = rVar;
            this.f190950d = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new p(dVar, this.f190948b, this.f190949c, this.f190950d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190947a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            SharedPreferences.Editor editorEdit = this.f190948b.S().edit();
            editorEdit.putLong(this.f190949c.f224891a, this.f190950d);
            editorEdit.commit();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((p) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.xml.XmlSharedPreferencesManager$set$$inlined$execute$5", f = "XmlSharedPreferencesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nXmlSharedPreferencesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager$execute$2\n+ 2 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager\n+ 3 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,218:1\n172#2:219\n173#2:228\n45#3,8:220\n*S KotlinDebug\n*F\n+ 1 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager\n*L\n172#1:220,8\n*E\n"})
    public static final class q extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f190952b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.r f190953c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f190954d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(kotlin.coroutines.d dVar, a aVar, com.planner5d.library.services.r rVar, boolean z10) {
            super(2, dVar);
            this.f190952b = aVar;
            this.f190953c = rVar;
            this.f190954d = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new q(dVar, this.f190952b, this.f190953c, this.f190954d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190951a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            SharedPreferences.Editor editorEdit = this.f190952b.S().edit();
            editorEdit.putBoolean(this.f190953c.f224891a, this.f190954d);
            editorEdit.commit();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((q) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.xml.XmlSharedPreferencesManager$set$$inlined$execute$6", f = "XmlSharedPreferencesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nXmlSharedPreferencesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager$execute$2\n+ 2 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager\n+ 3 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,218:1\n177#2:219\n178#2:228\n45#3,8:220\n*S KotlinDebug\n*F\n+ 1 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager\n*L\n177#1:220,8\n*E\n"})
    public static final class r extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f190956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f190957c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f190958d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(kotlin.coroutines.d dVar, a aVar, String str, boolean z10) {
            super(2, dVar);
            this.f190956b = aVar;
            this.f190957c = str;
            this.f190958d = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new r(dVar, this.f190956b, this.f190957c, this.f190958d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190955a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            SharedPreferences.Editor editorEdit = this.f190956b.S().edit();
            editorEdit.putBoolean(this.f190957c, this.f190958d);
            editorEdit.commit();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((r) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.xml.XmlSharedPreferencesManager$set$$inlined$execute$7", f = "XmlSharedPreferencesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nXmlSharedPreferencesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager$execute$2\n+ 2 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager\n+ 3 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,218:1\n182#2:219\n183#2:228\n45#3,8:220\n*S KotlinDebug\n*F\n+ 1 XmlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/xml/XmlSharedPreferencesManager\n*L\n182#1:220,8\n*E\n"})
    public static final class s extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f190960b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.r f190961c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Set f190962d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(kotlin.coroutines.d dVar, a aVar, com.planner5d.library.services.r rVar, Set set) {
            super(2, dVar);
            this.f190960b = aVar;
            this.f190961c = rVar;
            this.f190962d = set;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new s(dVar, this.f190960b, this.f190961c, this.f190962d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190959a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            SharedPreferences.Editor editorEdit = this.f190960b.S().edit();
            editorEdit.putStringSet(this.f190961c.f224891a, this.f190962d);
            editorEdit.commit();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((s) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.xml.XmlSharedPreferencesManager$setBlocking$1", f = "XmlSharedPreferencesManager.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    static final class t extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190963a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.r f190965c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f190966d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(com.planner5d.library.services.r rVar, String str, kotlin.coroutines.d<? super t> dVar) {
            super(2, dVar);
            this.f190965c = rVar;
            this.f190966d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new t(this.f190965c, this.f190966d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f190963a;
            if (i10 == 0) {
                ResultKt.m(obj);
                a aVar = a.this;
                com.planner5d.library.services.r rVar = this.f190965c;
                String str = this.f190966d;
                this.f190963a = 1;
                if (aVar.d(rVar, str, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((t) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public a(@NotNull SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.f190894a = preferences;
    }

    private final <T> Object R(Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1, kotlin.coroutines.d<? super T> dVar) {
        z1 z1VarD = com.planner5d.library.services.utility.s.f229729a.d();
        c cVar = new c(function1, null);
        h0.e(0);
        Object objH = kotlinx.coroutines.i.h(z1VarD, cVar, dVar);
        h0.e(1);
        return objH;
    }

    @Override // com.planner5d.library.model.manager.config.p
    @Nullable
    public Object A(@NotNull com.planner5d.library.services.r rVar, @NotNull Set<String> set, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.d(), new s(null, this, rVar, set), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.config.p
    @e.a({"ApplySharedPref"})
    @kotlin.l(message = "use coroutines with a typed key", replaceWith = @b1(expression = "set()", imports = {}))
    public void B(@NotNull String key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editorEdit = this.f190894a.edit();
        editorEdit.putString(key, str);
        editorEdit.commit();
    }

    @Override // com.planner5d.library.model.manager.config.p
    @Nullable
    public Object C(@NotNull String str, boolean z10, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.d(), new h(null, this, str, z10), dVar);
    }

    @Override // com.planner5d.library.model.manager.config.p
    @kotlin.l(message = "use coroutines with a typed key", replaceWith = @b1(expression = "getString()", imports = {}))
    @Nullable
    public String D(@NotNull String key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f190894a.getString(key, str);
    }

    @Override // com.planner5d.library.model.manager.config.p
    @NotNull
    public com.planner5d.library.model.manager.config.q E() {
        SharedPreferences.Editor editorEdit = this.f190894a.edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "edit(...)");
        return new com.planner5d.library.model.manager.config.xml.c(editorEdit);
    }

    @Override // com.planner5d.library.model.manager.config.p
    @kotlin.l(message = "use coroutines with a typed key", replaceWith = @b1(expression = "getStringSet()", imports = {}))
    @Nullable
    public Set<String> F(@NotNull String key, @Nullable Set<String> set) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f190894a.getStringSet(key, set);
    }

    @Override // com.planner5d.library.model.manager.config.p
    @Nullable
    public Object G(@NotNull com.planner5d.library.services.r rVar, boolean z10, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.d(), new g(null, this, rVar, z10), dVar);
    }

    @Override // com.planner5d.library.model.manager.config.p
    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "set()", imports = {}))
    public void H(@NotNull com.planner5d.library.services.r key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        c0.t(c0.f225068a, null, false, new t(key, str, null), 3, null);
    }

    @Override // com.planner5d.library.model.manager.config.p
    @Nullable
    public Object I(@NotNull String str, boolean z10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.d(), new r(null, this, str, z10), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.config.p
    @Nullable
    public Object J(@NotNull String str, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.d(), new b(null, this, str), dVar);
    }

    @Override // com.planner5d.library.model.manager.config.p
    @e.a({"ApplySharedPref"})
    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "clear()", imports = {}))
    @m1
    public void K() {
        SharedPreferences.Editor editorEdit = this.f190894a.edit();
        editorEdit.clear();
        editorEdit.commit();
    }

    @Override // com.planner5d.library.model.manager.config.p
    @Nullable
    public Object L(@NotNull com.planner5d.library.services.r rVar, boolean z10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.d(), new q(null, this, rVar, z10), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.config.p
    @e.a({"ApplySharedPref"})
    @kotlin.l(message = "use coroutines with a typed key", replaceWith = @b1(expression = "set()", imports = {}))
    public void M(@NotNull String key, boolean z10) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editorEdit = this.f190894a.edit();
        editorEdit.putBoolean(key, z10);
        editorEdit.commit();
    }

    @Override // com.planner5d.library.model.manager.config.p
    @kotlin.l(message = "use coroutines with a typed key", replaceWith = @b1(expression = "get()", imports = {}))
    public boolean N(@NotNull String key, boolean z10) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f190894a.getBoolean(key, z10);
    }

    @Override // com.planner5d.library.model.manager.config.p
    @e.a({"ApplySharedPref"})
    @kotlin.l(message = "use coroutines with a typed key", replaceWith = @b1(expression = "set()", imports = {}))
    public void O(@NotNull String key, int i10) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editorEdit = this.f190894a.edit();
        editorEdit.putInt(key, i10);
        editorEdit.commit();
    }

    @Override // com.planner5d.library.model.manager.config.p
    @e.a({"ApplySharedPref"})
    @kotlin.l(message = "use coroutines with a typed key", replaceWith = @b1(expression = "set()", imports = {}))
    public void P(@NotNull String key, long j10) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editorEdit = this.f190894a.edit();
        editorEdit.putLong(key, j10);
        editorEdit.commit();
    }

    @Override // com.planner5d.library.model.manager.config.p
    @Nullable
    public Object Q(@NotNull com.planner5d.library.services.r rVar, @NotNull kotlin.coroutines.d<? super JSONObject> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.d(), new d(null, this, rVar), dVar);
    }

    @NotNull
    public final SharedPreferences S() {
        return this.f190894a;
    }

    @Override // com.planner5d.library.model.manager.config.p
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objJ = J("", dVar);
        return objJ == kotlin.coroutines.intrinsics.b.l() ? objJ : Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.config.p
    @e.a({"ApplySharedPref"})
    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "remove()", imports = {}))
    @m1
    public void b(@NotNull com.planner5d.library.services.r key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editorEdit = this.f190894a.edit();
        editorEdit.remove(key.f224891a);
        editorEdit.commit();
    }

    @Override // com.planner5d.library.model.manager.config.p
    @Nullable
    public Object c(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.d(), new C1588a(null, this), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.config.p
    @Nullable
    public Object d(@NotNull com.planner5d.library.services.r rVar, @Nullable String str, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objV = v(rVar.f224891a, str, dVar);
        return objV == kotlin.coroutines.intrinsics.b.l() ? objV : Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.config.p
    @e.a({"ApplySharedPref"})
    @kotlin.l(message = "use coroutines with a typed key", replaceWith = @b1(expression = "set()", imports = {}))
    public void e(@NotNull String key, @NotNull Set<String> value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        SharedPreferences.Editor editorEdit = this.f190894a.edit();
        editorEdit.putStringSet(key, value);
        editorEdit.commit();
    }

    @Override // com.planner5d.library.model.manager.config.p
    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "set()", imports = {}))
    public void f(@NotNull com.planner5d.library.services.r key, boolean z10) {
        Intrinsics.checkNotNullParameter(key, "key");
        M(key.f224891a, z10);
    }

    @Override // com.planner5d.library.model.manager.config.p
    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "set()", imports = {}))
    public void g(@NotNull com.planner5d.library.services.r key, int i10) {
        Intrinsics.checkNotNullParameter(key, "key");
        O(key.f224891a, i10);
    }

    @Override // com.planner5d.library.model.manager.config.p
    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "set()", imports = {}))
    public void h(@NotNull com.planner5d.library.services.r key, long j10) {
        Intrinsics.checkNotNullParameter(key, "key");
        P(key.f224891a, j10);
    }

    @Override // com.planner5d.library.model.manager.config.p
    @Nullable
    public Object i(@NotNull com.planner5d.library.services.r rVar, @NotNull Set<String> set, @NotNull kotlin.coroutines.d<? super Set<String>> dVar) {
        return q(rVar.f224891a, set, dVar);
    }

    @Override // com.planner5d.library.model.manager.config.p
    @Nullable
    public Object j(@NotNull com.planner5d.library.services.r rVar, @NotNull JSONObject jSONObject, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.d(), new m(null, this, rVar, jSONObject), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.config.p
    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "get()", imports = {}))
    public long k(@NotNull com.planner5d.library.services.r key, long j10) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f190894a.getLong(key.f224891a, j10);
    }

    @Override // com.planner5d.library.model.manager.config.p
    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "get()", imports = {}))
    public int l(@NotNull com.planner5d.library.services.r key, int i10) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f190894a.getInt(key.f224891a, i10);
    }

    @Override // com.planner5d.library.model.manager.config.p
    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "get()", imports = {}))
    public boolean m(@NotNull com.planner5d.library.services.r key, boolean z10) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f190894a.getBoolean(key.f224891a, z10);
    }

    @Override // com.planner5d.library.model.manager.config.p
    @Nullable
    public Object n(@NotNull String str, @Nullable String str2, @NotNull kotlin.coroutines.d<? super String> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.d(), new j(null, this, str, str2), dVar);
    }

    @Override // com.planner5d.library.model.manager.config.p
    @Nullable
    public Object o(@NotNull com.planner5d.library.services.r rVar, long j10, @NotNull kotlin.coroutines.d<? super Long> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.d(), new f(null, this, rVar, j10), dVar);
    }

    @Override // com.planner5d.library.model.manager.config.p
    @Nullable
    public Object p(@NotNull com.planner5d.library.services.r rVar, int i10, @NotNull kotlin.coroutines.d<? super Integer> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.d(), new e(null, this, rVar, i10), dVar);
    }

    @Override // com.planner5d.library.model.manager.config.p
    @Nullable
    public Object q(@NotNull String str, @NotNull Set<String> set, @NotNull kotlin.coroutines.d<? super Set<String>> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.d(), new l(null, this, str, set), dVar);
    }

    @Override // com.planner5d.library.model.manager.config.p
    @Nullable
    public Object r(@NotNull com.planner5d.library.services.r rVar, long j10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.d(), new p(null, this, rVar, j10), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.config.p
    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "contains()", imports = {}))
    public boolean s(@NotNull com.planner5d.library.services.r key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return x(key.f224891a);
    }

    @Override // com.planner5d.library.model.manager.config.p
    @Nullable
    public Object t(@NotNull com.planner5d.library.services.r rVar, int i10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.d(), new o(null, this, rVar, i10), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.config.p
    @Nullable
    public Object u(@NotNull com.planner5d.library.services.r rVar, @Nullable String str, @NotNull kotlin.coroutines.d<? super String> dVar) {
        return n(rVar.f224891a, str, dVar);
    }

    @Override // com.planner5d.library.model.manager.config.p
    @Nullable
    public Object v(@NotNull String str, @Nullable String str2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        boolean z10 = false & false;
        Object objH = kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.d(), new n(null, this, str, str2), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.config.p
    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "getString()", imports = {}))
    @Nullable
    public String w(@NotNull com.planner5d.library.services.r key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (String) c0.t(c0.f225068a, null, false, new k(key, str, null), 3, null);
    }

    @Override // com.planner5d.library.model.manager.config.p
    @kotlin.l(message = "use coroutines with a typed key", replaceWith = @b1(expression = "contains()", imports = {}))
    @m1
    public boolean x(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f190894a.contains(key);
    }

    @Override // com.planner5d.library.model.manager.config.p
    @Nullable
    public Object y(@NotNull com.planner5d.library.services.r rVar, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        return J(rVar.f224891a, dVar);
    }

    @Override // com.planner5d.library.model.manager.config.p
    @Nullable
    public Object z(@NotNull kotlin.coroutines.d<? super Set<String>> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.d(), new i(null, this), dVar);
    }
}
