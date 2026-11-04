package com.devtodev.analytics.internal.backend.repository;

import com.devtodev.analytics.external.anticheat.DTDReceiptStatus;
import com.devtodev.analytics.external.anticheat.DTDVerifyResponse;
import com.devtodev.analytics.internal.backend.BackendConfig;
import com.devtodev.analytics.internal.backend.ConfigErr;
import com.devtodev.analytics.internal.backend.ConfigNoConnection;
import com.devtodev.analytics.internal.backend.repository.api.API;
import com.devtodev.analytics.internal.backend.repository.contentbuilder.IContentBuilder;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.network.INetwork;
import com.devtodev.analytics.internal.network.IRequestBuilder;
import com.devtodev.analytics.internal.network.Response;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class BackendRepository implements IBackendRepository {

    @NotNull
    private final IContentBuilder contentBuilder;

    @NotNull
    private final IJsonParser jsonParser;

    @NotNull
    private final INetwork network;

    public BackendRepository(@NotNull INetwork network, @NotNull IContentBuilder contentBuilder, @NotNull IJsonParser jsonParser) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(contentBuilder, "contentBuilder");
        Intrinsics.checkNotNullParameter(jsonParser, "jsonParser");
        this.network = network;
        this.contentBuilder = contentBuilder;
        this.jsonParser = jsonParser;
    }

    private final String getAbTestConfigPoint() {
        return getUTL() + "/v2/remoteconfig/experiments";
    }

    private final String getAbTestOfferPoint() {
        return getUTL() + "/v2/remoteconfig/offer";
    }

    private final String getAnalyticsEndPoint() {
        return getUTL() + "/v2/analytics/report";
    }

    private final String getConfigEndPoint() {
        return getUTL() + "/v2/analytics/config";
    }

    private final String getIdentificationPoint() {
        return getUTL() + "/v2/analytics/identification";
    }

    private final DTDReceiptStatus getReceiptStatus(long j10) {
        if (j10 == 0) {
            return DTDReceiptStatus.ReceiptValid;
        }
        if (j10 == 1) {
            return DTDReceiptStatus.ReceiptNotValid;
        }
        return j10 == 2 ? DTDReceiptStatus.ReceiptServerError : DTDReceiptStatus.ReceiptServerError;
    }

    private final String getUTL() {
        API api = API.INSTANCE;
        String test_proxy_url = api.getTEST_PROXY_URL().length() > 0 ? api.getTEST_PROXY_URL() : API.API_URL;
        if (api.getTEST_CUSTOM_URL().length() <= 0) {
            return test_proxy_url;
        }
        return test_proxy_url + api.getTEST_CUSTOM_URL();
    }

    private final String getVerifyPaymentEndPoint() {
        return getUTL() + "/v2/verify/payment";
    }

    @Override // com.devtodev.analytics.internal.backend.repository.IBackendRepository
    @NotNull
    public RemoteConfigSealedClass requestABTestConfig(@NotNull String appId, @NotNull BackendMessage message) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(message, "message");
        IRequestBuilder iRequestBuilderPost = this.network.post(getAbTestConfigPoint());
        iRequestBuilderPost.setQueryParam("appId", appId);
        iRequestBuilderPost.setContent(this.contentBuilder.getContent(message.getData(), message.getId()));
        Response responseSend = iRequestBuilderPost.build().send();
        if (responseSend instanceof Response.ResponseResult) {
            return this.jsonParser.parseRemoteConfig(((Response.ResponseResult) responseSend).getResult());
        }
        if (!(responseSend instanceof Response.DoNotRetryIdentification) && !(responseSend instanceof Response.ResponseDataReadError) && !(responseSend instanceof Response.ResponseConnectionNull)) {
            if (!(responseSend instanceof Response.ResponseError)) {
                return RemoteConfigErr.INSTANCE;
            }
            Response.ResponseError responseError = (Response.ResponseError) responseSend;
            Logger.INSTANCE.error(responseError.getResponseCode() + " " + responseError.getResponseMessage(), null);
            return RemoteConfigNoConnection.INSTANCE;
        }
        return RemoteConfigNoConnection.INSTANCE;
    }

    @Override // com.devtodev.analytics.internal.backend.repository.IBackendRepository
    @NotNull
    public AbTestOffer requestABTestOffer(@NotNull String appId, @NotNull BackendMessage message) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(message, "message");
        IRequestBuilder iRequestBuilderPost = this.network.post(getAbTestOfferPoint());
        iRequestBuilderPost.setQueryParam("appId", appId);
        iRequestBuilderPost.setContent(this.contentBuilder.getContent(message.getData(), message.getId()));
        Response responseSend = iRequestBuilderPost.build().send();
        if (responseSend instanceof Response.ResponseResult) {
            return this.jsonParser.parseAbTestOffer(((Response.ResponseResult) responseSend).getResult());
        }
        if (!(responseSend instanceof Response.ResponseDataReadError) && !(responseSend instanceof Response.ResponseConnectionNull)) {
            if (!(responseSend instanceof Response.ResponseError)) {
                return OfferErr.INSTANCE;
            }
            Response.ResponseError responseError = (Response.ResponseError) responseSend;
            Logger.INSTANCE.error(responseError.getResponseCode() + " " + responseError.getResponseMessage(), null);
            return RemoteOfferNoConnection.INSTANCE;
        }
        return RemoteOfferNoConnection.INSTANCE;
    }

    @Override // com.devtodev.analytics.internal.backend.repository.IBackendRepository
    @NotNull
    public BackendUserData requestBackendUserData(@NotNull String appId, @NotNull BackendMessage message) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(message, "message");
        IRequestBuilder iRequestBuilderPost = this.network.post(getIdentificationPoint());
        iRequestBuilderPost.setQueryParam("appId", appId);
        iRequestBuilderPost.setContent(this.contentBuilder.getContent(message.getData(), message.getId()));
        Response responseSend = iRequestBuilderPost.build().send();
        if (responseSend instanceof Response.ResponseResult) {
            return this.jsonParser.parseBackendUserData(((Response.ResponseResult) responseSend).getResult());
        }
        if (responseSend instanceof Response.DoNotRetryIdentification) {
            return DoNotRetryBackendUserData.INSTANCE;
        }
        if (responseSend instanceof Response.ResponseDataReadError) {
            return BackendUserDataNoConnection.INSTANCE;
        }
        if (!(responseSend instanceof Response.ResponseError)) {
            return BackendUserDataError.INSTANCE;
        }
        Response.ResponseError responseError = (Response.ResponseError) responseSend;
        return new BackendUserDataErrorWithResponse(responseError.getResponseCode(), responseError.getResponseMessage());
    }

    @Override // com.devtodev.analytics.internal.backend.repository.IBackendRepository
    @NotNull
    public BackendConfig requestConfig(@NotNull String appId, @NotNull BackendMessage message) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(message, "message");
        IRequestBuilder iRequestBuilderPost = this.network.post(getConfigEndPoint());
        iRequestBuilderPost.setQueryParam("appId", appId);
        iRequestBuilderPost.setContent(this.contentBuilder.getContent(message.getData(), message.getId()));
        Response responseSend = iRequestBuilderPost.build().send();
        if (responseSend instanceof Response.ResponseResult) {
            return this.jsonParser.parseConfig(((Response.ResponseResult) responseSend).getResult());
        }
        if (!(responseSend instanceof Response.ResponseDataReadError) && !(responseSend instanceof Response.ResponseConnectionNull)) {
            if (!(responseSend instanceof Response.ResponseError)) {
                return ConfigErr.INSTANCE;
            }
            Response.ResponseError responseError = (Response.ResponseError) responseSend;
            Logger.INSTANCE.error(responseError.getResponseCode() + " " + responseError.getResponseMessage(), null);
            return ConfigNoConnection.INSTANCE;
        }
        return ConfigNoConnection.INSTANCE;
    }

    @Override // com.devtodev.analytics.internal.backend.repository.IBackendRepository
    @NotNull
    public AnalyticsReport sendAnalytics(@NotNull String appId, @NotNull BackendMessage message, @NotNull String reportUuid) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(reportUuid, "reportUuid");
        IRequestBuilder iRequestBuilderPost = this.network.post(getAnalyticsEndPoint());
        iRequestBuilderPost.setQueryParam("appId", appId);
        iRequestBuilderPost.setContent(this.contentBuilder.getContent(message.getData(), message.getId()));
        iRequestBuilderPost.setRequestIdentifier(reportUuid);
        Response responseSend = iRequestBuilderPost.build().send();
        if (responseSend instanceof Response.ResponseResult) {
            return AnalyticsReport.Success.INSTANCE;
        }
        if (!(responseSend instanceof Response.ResponseError)) {
            if (!(responseSend instanceof Response.ResponseDataReadError)) {
                return AnalyticsReport.Error.INSTANCE;
            }
            Logger.error$default(Logger.INSTANCE, "Report [" + reportUuid + "] submission failed: " + ((Response.ResponseDataReadError) responseSend).getMessage(), null, 2, null);
            return AnalyticsReport.Error.INSTANCE;
        }
        Response.ResponseError responseError = (Response.ResponseError) responseSend;
        Logger.INSTANCE.error("Failed to send Report [" + reportUuid + "] with status code: " + responseError.getResponseCode() + " " + responseError.getResponseMessage(), null);
        return AnalyticsReport.Error.INSTANCE;
    }

    @Override // com.devtodev.analytics.internal.backend.repository.IBackendRepository
    @NotNull
    public DTDVerifyResponse sendVerifyReceipt(@NotNull String appId, @NotNull BackendMessage message) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(message, "message");
        IRequestBuilder iRequestBuilderPost = this.network.post(getVerifyPaymentEndPoint());
        iRequestBuilderPost.setQueryParam("appId", appId);
        iRequestBuilderPost.setContent(this.contentBuilder.getContent(message.getData(), message.getId()));
        try {
            Response responseSend = iRequestBuilderPost.build().send();
            if (responseSend instanceof Response.ResponseResult) {
                JSONObject jSONObject = new JSONObject(((Response.ResponseResult) responseSend).getResult());
                DTDVerifyResponse dTDVerifyResponse = new DTDVerifyResponse(getReceiptStatus(jSONObject.getLong("status")), jSONObject.isNull("verificationResult") ? "" : jSONObject.getString("verificationResult"));
                Logger.INSTANCE.info("[Backend Module] Receipt verification result: \n\t" + dTDVerifyResponse, null);
                return dTDVerifyResponse;
            }
            if (!(responseSend instanceof Response.ResponseError)) {
                Logger.error$default(Logger.INSTANCE, "[Backend Module] Failed to send receipt", null, 2, null);
                return new DTDVerifyResponse(DTDReceiptStatus.ReceiptInternalError, null);
            }
            Logger.INSTANCE.error("[Backend Module] Failed to send receipt, status code: " + ((Response.ResponseError) responseSend).getResponseCode(), null);
            return new DTDVerifyResponse(DTDReceiptStatus.ReceiptServerError, null);
        } catch (Exception e10) {
            Logger.INSTANCE.error("[Backend Module] Can't build request for verification of receipt. Error:", e10);
            return new DTDVerifyResponse(DTDReceiptStatus.ReceiptInternalError, null);
        }
    }
}
