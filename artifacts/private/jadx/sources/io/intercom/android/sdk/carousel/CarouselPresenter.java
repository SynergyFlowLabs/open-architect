package io.intercom.android.sdk.carousel;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.api.BaseCallback;
import io.intercom.android.sdk.api.ErrorObject;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.models.carousel.CarouselResponse;
import io.intercom.android.sdk.models.carousel.CarouselScreen;
import io.intercom.android.sdk.models.carousel.ScreenAction;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class CarouselPresenter {
    private final Api api;
    private Carousel carousel;

    @p0
    private String carouselId;
    private String carouselSource;
    private final IntercomDataLayer dataLayer;
    private int initialNumberOfScreens;
    private final MetricTracker metricTracker;
    private final PermissionManager permissionManager;
    private UserIdentity userIdentity;
    private CarouselView view;

    public CarouselPresenter(Api api, UserIdentity userIdentity, MetricTracker metricTracker, PermissionManager permissionManager, IntercomDataLayer intercomDataLayer) {
        Carousel carousel = Carousel.NULL;
        this.carousel = carousel;
        this.view = null;
        this.carouselSource = MetricTracker.CarouselSource.PROGRAMMATIC;
        this.carouselId = null;
        this.api = api;
        this.userIdentity = userIdentity;
        this.metricTracker = metricTracker;
        this.permissionManager = permissionManager;
        this.dataLayer = intercomDataLayer;
        filterCarouselScreens(carousel);
    }

    private void fetchAutomaticCarousel() {
        Carousel carousel = this.dataLayer.getOverlayState().getValue().getCarousel();
        this.carousel = carousel;
        this.initialNumberOfScreens = carousel.getScreens().size();
        filterCarouselScreens(this.carousel);
        CarouselView carouselView = this.view;
        if (carouselView != null) {
            carouselView.showSuccess(this.carousel);
        }
    }

    private void fetchProgrammaticCarousel(@NonNull final String str) {
        this.metricTracker.startedCarouselFetching(str, this.carouselSource);
        CarouselView carouselView = this.view;
        if (carouselView != null) {
            carouselView.showLoading();
        }
        this.api.fetchProgrammaticCarousel(str, new BaseCallback<CarouselResponse.Builder>() { // from class: io.intercom.android.sdk.carousel.CarouselPresenter.1
            @Override // io.intercom.android.sdk.api.BaseCallback
            protected void onError(@NonNull ErrorObject errorObject) {
                CarouselPresenter.this.metricTracker.failedCarousel(str, CarouselPresenter.this.carouselSource, errorObject.getStatusCode());
                if (CarouselPresenter.this.view != null) {
                    if (errorObject.getStatusCode() == 404) {
                        CarouselPresenter.this.view.showNotFoundError();
                    } else {
                        CarouselPresenter.this.view.showGenericError();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // io.intercom.android.sdk.api.BaseCallback
            public void onSuccess(@NonNull CarouselResponse.Builder builder) {
                CarouselPresenter.this.carousel = builder.build().carousel().build();
                if (CarouselPresenter.this.view != null) {
                    CarouselPresenter.this.view.showSuccess(CarouselPresenter.this.carousel);
                }
            }
        });
    }

    private boolean isTriggeredFromCode() {
        return this.carouselSource.equals(MetricTracker.CarouselSource.PROGRAMMATIC);
    }

    private boolean noUserRegistered() {
        return !this.userIdentity.identityExists() || this.userIdentity.isSoftReset();
    }

    private void setSource(@p0 String str) {
        this.carouselSource = str == null ? "automatic" : MetricTracker.CarouselSource.PROGRAMMATIC;
    }

    public void attachView(CarouselView carouselView) {
        this.view = carouselView;
    }

    public void detachView() {
        this.view = null;
    }

    public void fetchCarousel(@p0 String str) {
        this.carouselId = str;
        setSource(str);
        if (!MetricTracker.CarouselSource.PROGRAMMATIC.equals(this.carouselSource)) {
            fetchAutomaticCarousel();
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.view.logEmptyCarouselError();
            this.view.showNotFoundError();
        } else if (!noUserRegistered()) {
            fetchProgrammaticCarousel(str);
        } else {
            this.view.logUserNotRegisteredError();
            this.view.showNotFoundError();
        }
    }

    @l1
    void filterCarouselScreens(Carousel carousel) {
        Iterator<CarouselScreen> it = carousel.getScreens().iterator();
        while (it.hasNext()) {
            if (screenShouldBeRemoved(it.next())) {
                it.remove();
            }
        }
    }

    public Carousel getCarousel() {
        return this.carousel;
    }

    public String getCarouselSource() {
        return this.carouselSource;
    }

    public void recordActionButtonTappedStats(@NonNull String str) {
        this.api.markCarouselActionButtonTapped(getCarousel().getInstanceId(), str, isTriggeredFromCode());
    }

    public void recordDismissedOrCompletedMetric(String str, boolean z10, int i10) {
        String instanceId = getCarousel().getInstanceId();
        if (TextUtils.isEmpty(instanceId)) {
            if (TextUtils.isEmpty(this.carouselId)) {
                return;
            }
            this.metricTracker.dismissedCarouselFetching(str, this.carouselId, this.carouselSource);
        } else {
            int size = getCarousel().getScreens().size();
            if (z10) {
                this.metricTracker.completedCarousel(str, instanceId, this.carouselSource, this.initialNumberOfScreens, size);
            } else {
                this.metricTracker.dismissedCarousel(str, instanceId, this.carouselSource, this.initialNumberOfScreens, size, i10);
            }
        }
    }

    public void recordDismissedOrCompletedStats(boolean z10) {
        String instanceId = getCarousel().getInstanceId();
        if (TextUtils.isEmpty(instanceId)) {
            return;
        }
        if (z10) {
            this.api.markCarouselAsCompleted(instanceId, isTriggeredFromCode());
        } else {
            this.api.markCarouselAsDismissed(instanceId, isTriggeredFromCode());
        }
    }

    public void recordOpenMetric() {
        this.metricTracker.openedCarousel(getCarousel().getInstanceId(), this.carouselSource, this.initialNumberOfScreens, getCarousel().getScreens().size());
    }

    public void recordPermissionRequestedMetric(String str, int[] iArr, String str2) {
        String instanceId = getCarousel().getInstanceId();
        boolean z10 = false;
        for (int i10 : iArr) {
            if (i10 == 0) {
                this.api.markPermissionGranted(instanceId, str2, isTriggeredFromCode());
                z10 = true;
                break;
            }
        }
        this.metricTracker.requestedPermission(str, instanceId, this.carouselSource, z10);
    }

    public void recordScreenSeenStats(String str) {
        this.api.markCarouselScreenViewed(getCarousel().getInstanceId(), str, isTriggeredFromCode());
    }

    public void recordSentToPermissionSettingsMetric(ScreenAction screenAction, String str) {
        String type = screenAction.getType();
        boolean zPermissionsGranted = this.permissionManager.permissionsGranted(screenAction.getValidPermissions(this.permissionManager));
        String instanceId = getCarousel().getInstanceId();
        if (zPermissionsGranted) {
            this.api.markPermissionGranted(instanceId, str, isTriggeredFromCode());
        }
        this.metricTracker.sentToPermissionSettings(type, instanceId, this.carouselSource, zPermissionsGranted);
    }

    public void resetPersistedCarousel() {
        this.dataLayer.clearCarousel();
    }

    public void retryFetch(@p0 String str) {
        if (!TextUtils.isEmpty(str)) {
            this.metricTracker.retriedCarouselFetching(str, this.carouselSource);
            fetchProgrammaticCarousel(str);
        } else {
            CarouselView carouselView = this.view;
            if (carouselView != null) {
                carouselView.showNotFoundError();
            }
        }
    }

    @l1
    boolean screenShouldBeRemoved(CarouselScreen carouselScreen) {
        ScreenAction permissionAction = carouselScreen.getPermissionAction();
        if (ScreenAction.NULL.equals(permissionAction)) {
            return false;
        }
        List<String> validPermissions = permissionAction.getValidPermissions(this.permissionManager);
        return validPermissions.isEmpty() || this.permissionManager.permissionsGranted(validPermissions);
    }
}
