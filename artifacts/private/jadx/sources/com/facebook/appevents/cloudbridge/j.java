package com.facebook.appevents.cloudbridge;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public enum j {
    UNLOCKED_ACHIEVEMENT("AchievementUnlocked"),
    ACTIVATED_APP("ActivateApp"),
    ADDED_PAYMENT_INFO("AddPaymentInfo"),
    ADDED_TO_CART("AddToCart"),
    ADDED_TO_WISHLIST("AddToWishlist"),
    COMPLETED_REGISTRATION("CompleteRegistration"),
    VIEWED_CONTENT("ViewContent"),
    INITIATED_CHECKOUT("InitiateCheckout"),
    ACHIEVED_LEVEL("LevelAchieved"),
    PURCHASED("Purchase"),
    RATED("Rate"),
    SEARCHED("Search"),
    SPENT_CREDITS("SpentCredits"),
    COMPLETED_TUTORIAL("TutorialCompletion");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f98708a;

    static {
        int i10 = 4 >> 7;
    }

    j(String str) {
        this.f98708a = str;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static j[] valuesCustom() {
        j[] jVarArrValuesCustom = values();
        return (j[]) Arrays.copyOf(jVarArrValuesCustom, jVarArrValuesCustom.length);
    }

    @NotNull
    public final String l() {
        return this.f98708a;
    }
}
