package defpackage;

import android.util.Base64;
import com.devtodev.analytics.internal.storage.sqlite.PeopleCardEntry;
import com.superwall.sdk.dependencies.VariablesFactory;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.models.config.ComputedPropertyRequest;
import com.superwall.sdk.models.events.EventData;
import com.superwall.sdk.models.paywall.Paywall;
import com.superwall.sdk.models.product.ProductVariable;
import com.superwall.sdk.models.triggers.Experiment;
import com.superwall.sdk.paywall.view.webview.templating.models.ExperimentTemplate;
import com.superwall.sdk.paywall.view.webview.templating.models.FreeTrialTemplate;
import com.superwall.sdk.paywall.view.webview.templating.models.JsonVariables;
import com.superwall.sdk.paywall.view_controller.web_view.templating.models.ProductTemplate;
import java.util.List;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f392a = new a();

    /* JADX INFO: renamed from: a$a, reason: collision with other inner class name */
    @f(c = "TemplateLogic", f = "TemplateLogic.kt", i = {0, 0, 0}, l = {27}, m = "getBase64EncodedTemplates", n = {PeopleCardEntry.json, "paywall", "productsTemplate"}, s = {"L$0", "L$1", "L$2"})
    static final class C0000a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f395c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f396d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f398f;

        C0000a(kotlin.coroutines.d<? super C0000a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f396d = obj;
            this.f398f |= Integer.MIN_VALUE;
            int i10 = 5 | 0;
            return a.this.a(null, null, null, null, this);
        }
    }

    private a() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object a(@NotNull Json json, @NotNull Paywall paywall, @Nullable EventData eventData, @NotNull VariablesFactory variablesFactory, @NotNull kotlin.coroutines.d<? super String> dVar) {
        C0000a c0000a;
        Paywall paywall2;
        ProductTemplate productTemplate;
        String id2;
        String id3;
        String groupId;
        Experiment.Variant variant;
        if (dVar instanceof C0000a) {
            c0000a = (C0000a) dVar;
            int i10 = c0000a.f398f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0000a.f398f = i10 - Integer.MIN_VALUE;
            } else {
                c0000a = new C0000a(dVar);
            }
        } else {
            c0000a = new C0000a(dVar);
        }
        Object obj = c0000a.f396d;
        Object objL = b.l();
        int i11 = c0000a.f398f;
        if (i11 == 0) {
            ResultKt.m(obj);
            ProductTemplate productTemplate2 = new ProductTemplate("products", paywall.getProductItems());
            List<ProductVariable> productVariables = paywall.getProductVariables();
            List<ComputedPropertyRequest> computedPropertyRequests = paywall.getComputedPropertyRequests();
            c0000a.f393a = json;
            c0000a.f394b = paywall;
            c0000a.f395c = productTemplate2;
            c0000a.f398f = 1;
            Object objMakeJsonVariables = variablesFactory.makeJsonVariables(productVariables, computedPropertyRequests, eventData, c0000a);
            if (objMakeJsonVariables == objL) {
                return objL;
            }
            paywall2 = paywall;
            productTemplate = productTemplate2;
            obj = objMakeJsonVariables;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ProductTemplate productTemplate3 = (ProductTemplate) c0000a.f395c;
            Paywall paywall3 = (Paywall) c0000a.f394b;
            Json json2 = (Json) c0000a.f393a;
            ResultKt.m(obj);
            paywall2 = paywall3;
            productTemplate = productTemplate3;
            json = json2;
        }
        Paywall paywall4 = paywall2;
        JsonVariables jsonVariables = (JsonVariables) obj;
        FreeTrialTemplate freeTrialTemplate = new FreeTrialTemplate("template_substitutions_prefix", paywall4.isFreeTrialAvailable() ? "freeTrial" : null);
        Experiment experiment = paywall4.getExperiment();
        String str = "";
        if (experiment == null || (id2 = experiment.getId()) == null) {
            id2 = "";
        }
        Experiment experiment2 = paywall4.getExperiment();
        if (experiment2 == null || (variant = experiment2.getVariant()) == null || (id3 = variant.getId()) == null) {
            id3 = "";
        }
        Experiment experiment3 = paywall4.getExperiment();
        if (experiment3 != null && (groupId = experiment3.getGroupId()) != null) {
            str = groupId;
        }
        String str2 = "[" + CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new String[]{json.encodeToString(ProductTemplate.Companion.serializer(), productTemplate), json.encodeToString(JsonVariables.Companion.serializer(), jsonVariables), json.encodeToString(FreeTrialTemplate.Companion.serializer(), freeTrialTemplate), json.encodeToString(ExperimentTemplate.Companion.serializer(), new ExperimentTemplate("experiment", id2, id3, str))}), ",", null, null, 0, null, null, 62, null) + "]";
        byte[] bytes = str2.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.superwallCore, "!!! Template Logic: " + str2, null, null, 24, null);
        String strEncodeToString = Base64.encodeToString(bytes, 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }
}
