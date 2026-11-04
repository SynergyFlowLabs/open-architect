package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@g0
final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f118654a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f118655b = 10;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f118656c = 20;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final float f118657d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f118658e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final String f118659f = "Node %s is not an element of this graph.";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f118660g = "Edge %s is not an element of this graph.";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f118661h = "Node %s that was used to generate this set is no longer in the graph.";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final String f118662i = "Node %s or node %s that were used to generate this set are no longer in the graph.";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final String f118663j = "Edge %s that was used to generate this set is no longer in the graph.";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final String f118664k = "Edge %s already exists between the following nodes: %s, so it cannot be reused to connect the following nodes: %s.";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final String f118665l = "Cannot call edgeConnecting() when parallel edges exist between %s and %s. Consider calling edgesConnecting() instead.";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final String f118666m = "Nodes %s and %s are already connected by a different edge. To construct a graph that allows parallel edges, call allowsParallelEdges(true) on the Builder.";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final String f118667n = "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final String f118668o = "Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final String f118669p = "Edge %s already exists in the graph.";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final String f118670q = "Mismatch: endpoints' ordering is not compatible with directionality of the graph";

    enum a {
        EDGE_EXISTS
    }

    private p0() {
    }
}
