package io.intercom.android.sdk.metrics;

import android.content.Context;
import androidx.annotation.l1;
import com.google.gson.f;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.metrics.ops.OpsMetricObject;
import io.intercom.android.sdk.persistence.JsonStorage;
import io.intercom.android.sdk.utilities.IoUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes13.dex */
public class MetricsStore {
    private static final String METRICS_DIR = "intercomMetrics";
    private static final String OPS_METRICS_DIR = "intercomOpsMetrics";
    private static final int STORED_METRIC_LIMIT = 200;
    private static final int STORED_OP_METRIC_LIMIT = 100;
    private final Provider<Api> apiProvider;
    private final Provider<AppConfig> appConfigProvider;
    private final JsonStorage.LoadFailureHandler deleteOnFailureHandler;
    private final Executor executor;
    private final String installerPackageName;
    private final boolean isDebugBuild;
    private final File metricsDir;
    private final File opsMetricsDir;
    private final JsonStorage storage;
    private final Twig twig;

    public MetricsStore(Context context, Provider<Api> provider, Provider<AppConfig> provider2) {
        this(provider, provider2, Executors.newSingleThreadExecutor(), new JsonStorage(new f()), new File(context.getCacheDir(), METRICS_DIR), new File(context.getCacheDir(), OPS_METRICS_DIR), AppTypeDetector.isDebugBuild(context), AppTypeDetector.getInstallerPackageName(context), LumberMill.getLogger());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void copyNonNullItems(List<T> list, List<T> list2) {
        for (T t10 : list) {
            if (t10 != null) {
                list2.add(t10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File getFile(MetricObject metricObject) {
        return new File(this.metricsDir, metricObject.getId() + ".json");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasReachedMetricStorageLimit() {
        return this.storage.getDirectoryFileCount(this.metricsDir) > 200;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasReachedOpsMetricStorageLimit() {
        return this.storage.getDirectoryFileCount(this.opsMetricsDir) > 100;
    }

    private boolean isDisabled() {
        return !this.appConfigProvider.get().isMetricsEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uploadMetrics(final List<MetricObject> list, final List<OpsMetricObject> list2) {
        this.apiProvider.get().sendMetrics(list, list2, new Callback<Void>() { // from class: io.intercom.android.sdk.metrics.MetricsStore.4
            @Override // retrofit2.Callback
            public void onFailure(Call<Void> call, Throwable th2) {
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<Void> call, Response<Void> response) {
                if (response.isSuccessful() || response.code() == 400) {
                    MetricsStore.this.executor.execute(new Runnable() { // from class: io.intercom.android.sdk.metrics.MetricsStore.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                            MetricsStore.this.deleteFilesFor(list, list2);
                        }
                    });
                }
            }
        });
    }

    @l1
    void deleteFilesFor(List<MetricObject> list, List<OpsMetricObject> list2) {
        Iterator<MetricObject> it = list.iterator();
        while (it.hasNext()) {
            IoUtils.safelyDelete(getFile(it.next()));
        }
        Iterator<OpsMetricObject> it2 = list2.iterator();
        while (it2.hasNext()) {
            IoUtils.safelyDelete(getFile(it2.next()));
        }
    }

    public void loadAndSendMetrics() {
        this.executor.execute(new Runnable() { // from class: io.intercom.android.sdk.metrics.MetricsStore.3
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                List<MetricObject> listLoadMetrics = MetricsStore.this.loadMetrics();
                List<OpsMetricObject> listLoadOpsMetrics = MetricsStore.this.loadOpsMetrics();
                if (listLoadMetrics.isEmpty() && listLoadOpsMetrics.isEmpty()) {
                    return;
                }
                MetricsStore.this.uploadMetrics(listLoadMetrics, listLoadOpsMetrics);
            }
        });
    }

    @l1
    List<MetricObject> loadMetrics() throws Throwable {
        final ArrayList arrayList = new ArrayList();
        this.storage.loadFilesInDirectory(this.metricsDir, MetricObject.class, new JsonStorage.LoadHandler<List<MetricObject>>() { // from class: io.intercom.android.sdk.metrics.MetricsStore.5
            @Override // io.intercom.android.sdk.persistence.JsonStorage.LoadHandler
            public void onLoad(List<MetricObject> list) {
                MetricsStore.copyNonNullItems(list, arrayList);
            }
        }, this.deleteOnFailureHandler);
        return arrayList;
    }

    @l1
    List<OpsMetricObject> loadOpsMetrics() throws Throwable {
        final ArrayList arrayList = new ArrayList();
        this.storage.loadFilesInDirectory(this.opsMetricsDir, OpsMetricObject.class, new JsonStorage.LoadHandler<List<OpsMetricObject>>() { // from class: io.intercom.android.sdk.metrics.MetricsStore.6
            @Override // io.intercom.android.sdk.persistence.JsonStorage.LoadHandler
            public void onLoad(List<OpsMetricObject> list) {
                MetricsStore.copyNonNullItems(list, arrayList);
            }
        }, this.deleteOnFailureHandler);
        return arrayList;
    }

    public void track(final MetricObject metricObject) {
        if (isDisabled()) {
            return;
        }
        metricObject.addInstallerPackageName(this.installerPackageName).addIsDebugBuild(this.isDebugBuild);
        this.executor.execute(new Runnable() { // from class: io.intercom.android.sdk.metrics.MetricsStore.1
            @Override // java.lang.Runnable
            public void run() {
                if (MetricsStore.this.hasReachedMetricStorageLimit()) {
                    return;
                }
                JsonStorage jsonStorage = MetricsStore.this.storage;
                MetricObject metricObject2 = metricObject;
                jsonStorage.saveToFileAsJson(metricObject2, MetricsStore.this.getFile(metricObject2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File getFile(OpsMetricObject opsMetricObject) {
        return new File(this.opsMetricsDir, opsMetricObject.getId() + ".json");
    }

    public void track(final OpsMetricObject opsMetricObject) {
        if (isDisabled()) {
            return;
        }
        this.executor.execute(new Runnable() { // from class: io.intercom.android.sdk.metrics.MetricsStore.2
            @Override // java.lang.Runnable
            public void run() {
                if (MetricsStore.this.hasReachedOpsMetricStorageLimit()) {
                    return;
                }
                JsonStorage jsonStorage = MetricsStore.this.storage;
                OpsMetricObject opsMetricObject2 = opsMetricObject;
                jsonStorage.saveToFileAsJson(opsMetricObject2, MetricsStore.this.getFile(opsMetricObject2));
            }
        });
    }

    @l1
    MetricsStore(Provider<Api> provider, Provider<AppConfig> provider2, Executor executor, JsonStorage jsonStorage, File file, File file2, boolean z10, String str, Twig twig) {
        this.deleteOnFailureHandler = new JsonStorage.LoadFailureHandler() { // from class: io.intercom.android.sdk.metrics.MetricsStore.7
            @Override // io.intercom.android.sdk.persistence.JsonStorage.LoadFailureHandler
            public void onLoadFailed(File file3, Exception exc) {
                IoUtils.safelyDelete(file3);
                MetricsStore.this.twig.v(exc, "Couldn't load file " + file3.getAbsolutePath(), new Object[0]);
            }
        };
        this.apiProvider = provider;
        this.appConfigProvider = provider2;
        this.executor = executor;
        this.storage = jsonStorage;
        this.metricsDir = file;
        this.opsMetricsDir = file2;
        this.isDebugBuild = z10;
        this.installerPackageName = str;
        this.twig = twig;
    }
}
