package com.planner5d.planner5d;

import androidx.annotation.NonNull;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class l extends com.planner5d.library.application.d {
    l(Application application) {
        super(application, 1, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjuyRYZk4H3WkFudDuf+xaYS+AftFaAXi0S3ZY8wYR9VvQCjL5kOvRBExej/MdpVx5gSzVo7OtigFZR+lOIYKICdQFPJJRqMzWIQJ53Cnm5zN5QlCXO0kIr3DkxUSfRGni+bnvPfmen2tNXP94cHpSWKWhGea9+1VYKt4f+t0AZ+77GbUeXMHmfAb289Olw1IiHB+cK15uJ+/IAucVfo9yM3D3VAnaIsQljRpbQIi3myn8incaPp6K8P6s2A+/6FVhxrBR/Rs4QphhSBbeGlnhxqdgsNNr9oOXKLghuAQ3n8FmMFus/eAVMToGisD3zQSiAulOBYvam1H56dwShr7fQIDAQAB");
    }

    @NonNull
    private com.planner5d.library.model.manager.config.g u() throws RuntimeException {
        try {
            int i10 = 1 >> 2;
            return new com.planner5d.library.model.manager.config.g(Boolean.FALSE, null, new JSONObject().put(com.planner5d.library.services.r.immediate.f224891a, false).put(com.planner5d.library.services.r.daysToRepeat.f224891a, 2));
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    @NonNull
    private com.planner5d.library.model.manager.config.g v() throws RuntimeException {
        try {
            return new com.planner5d.library.model.manager.config.g(Boolean.TRUE, null, new JSONObject("\t{\n\t\t\"onboarding\": {\"layout\": \"premium_green\"},\n\t\t\"profile\": {\"layout\": \"premium_green\"},\n\t\t\"profile_renders\": {\"layout\": \"purchase_snapshots\"},\n\t\t\"profile_textures\": {\"layout\": \"purchase_textures\"},\n\t\t\"locked_item\": {\"layout\": \"premium_green\"},\n\t\t\"locked_item_gift\": {\"layout\": \"premium_green\"},\n\t\t\"locked_edit\": {\"layout\": \"premium_green\"},\n\t\t\"locked_save\": {\"layout\": \"premium_green\"},\n\t\t\"editing\": {\"layout\": \"premium_green\"},\n\t\t\"menu_catalog\": {\"layout\": \"premium_green\"},\n\t\t\"snapshots\": {\"layout\": \"purchase_snapshots\"},\n\t\t\"textures\": {\"layout\": \"purchase_textures\"},\n\t\t\"upload_plan\": {\"layout\": \"premium_green\"},\n\t\t\"design_generator\": {\"layout\": \"design_generator\"},\n\t\t\"ai_smart_wizard_a\": {\"layout\": \"none\"},\n\t\t\"ai_smart_wizard_b\": {\"layout\": \"superwall\"},\n\t\t\"ai_designer\": {\"layout\": \"premium_green\"},\n\t\t\"ai_designer_b\": {\"layout\": \"none\"},\n\t\t\"ai_renders\": {\"layout\": \"pro_green\"},\n\t\t\"compare_plans_premium\": {\"layout\": \"premium_green\"},\n\t\t\"compare_plans_pro\": {\"layout\": \"pro_green\"},\n\t\t\"plan_recognitions\": {\"layout\": \"plan_recognitions\"},\n\t\t\"fallback\": {\"layout\": \"premium_green\"}\n\t}\n"));
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    @NonNull
    private com.planner5d.library.model.manager.config.g w() throws RuntimeException {
        try {
            return new com.planner5d.library.model.manager.config.g(Boolean.TRUE, null, new JSONObject("{\n\t\"events\": [\n\t\t\"paywall_open\",\n\t\t\"paywall_close\",\n\t\t\"paywall_decline\",\n\t\t\"freeTrial_start\",\n\t\t\"deepLink_open\",\n\t\t\"paywallProductsLoad_start\",\n\t\t\"paywallProductsLoad_complete\",\n\t\t\"paywallProductsLoad_fail\",\n\t\t\"paywallProductsLoad_retry\",\n\t\t\"paywallWebviewLoad_start\",\n\t\t\"paywallWebviewLoad_complete\",\n\t\t\"paywallWebviewLoad_fail\",\n\t\t\"paywallWebviewLoad_fallback\",\n\t\t\"paywallWebviewLoad_timeout\",\n\t\t\"user_attributes\"\n\t]\n}\n"));
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // com.planner5d.library.model.manager.x2
    public boolean a() {
        return true;
    }

    @Override // com.planner5d.library.model.manager.q2
    @NonNull
    public com.planner5d.library.model.payments.paymentmethod.e.a b() {
        return com.planner5d.library.model.payments.paymentmethod.e.a.Google;
    }

    @Override // zc.b
    @NonNull
    public zc.a d() {
        return zc.a.None;
    }

    @Override // com.planner5d.library.application.d
    public boolean f() {
        return true;
    }

    @Override // com.planner5d.library.application.d
    public boolean i() {
        return false;
    }

    @Override // com.planner5d.library.application.d
    public boolean j() {
        return false;
    }

    @Override // com.planner5d.library.application.d
    protected void p(@NonNull Map<com.planner5d.library.model.manager.config.f, com.planner5d.library.model.manager.config.g> map) {
        map.put(com.planner5d.library.model.manager.config.f.AuthenticationSocialGoogle, new com.planner5d.library.model.manager.config.g(true));
        map.put(com.planner5d.library.model.manager.config.f.Appsflyer, new com.planner5d.library.model.manager.config.g(true));
        map.put(com.planner5d.library.model.manager.config.f.Contests, new com.planner5d.library.model.manager.config.g(true));
        map.put(com.planner5d.library.model.manager.config.f.FeedHome, new com.planner5d.library.model.manager.config.g(true));
        map.put(com.planner5d.library.model.manager.config.f.LogsApi, new com.planner5d.library.model.manager.config.g(true));
        map.put(com.planner5d.library.model.manager.config.f.LogsFirebase, new com.planner5d.library.model.manager.config.g(true));
        map.put(com.planner5d.library.model.manager.config.f.Onboarding, new com.planner5d.library.model.manager.config.g(true));
        map.put(com.planner5d.library.model.manager.config.f.PurchasePlacements, v());
        map.put(com.planner5d.library.model.manager.config.f.SignInWithCode, new com.planner5d.library.model.manager.config.g(true));
        map.put(com.planner5d.library.model.manager.config.f.TriggerAppUpdate, u());
        map.put(com.planner5d.library.model.manager.config.f.SuperwallEventsEnabled, w());
    }

    @Override // com.planner5d.library.application.d
    public boolean q() {
        return true;
    }

    @Override // com.planner5d.library.application.d
    public boolean t() {
        return false;
    }
}
