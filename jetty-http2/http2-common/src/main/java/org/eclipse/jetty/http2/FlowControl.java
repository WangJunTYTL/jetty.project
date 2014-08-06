//
//  ========================================================================
//  Copyright (c) 1995-2014 Mort Bay Consulting Pty. Ltd.
//  ------------------------------------------------------------------------
//  All rights reserved. This program and the accompanying materials
//  are made available under the terms of the Eclipse Public License v1.0
//  and Apache License v2.0 which accompanies this distribution.
//
//      The Eclipse Public License is available at
//      http://www.eclipse.org/legal/epl-v10.html
//
//      The Apache License v2.0 is available at
//      http://www.opensource.org/licenses/apache2.0.php
//
//  You may elect to redistribute this code under either of these licenses.
//  ========================================================================
//

package org.eclipse.jetty.http2;

import org.eclipse.jetty.http2.frames.WindowUpdateFrame;

public interface FlowControl
{
    public void onNewStream(IStream stream);

    public int getInitialWindowSize();

    public void updateInitialWindowSize(ISession session, int initialWindowSize);

    public void onWindowUpdate(ISession session, IStream stream, WindowUpdateFrame frame);

    public void onDataReceived(IStream stream, int length);

    public void onDataConsumed(IStream stream, int length);

    public void onDataSending(IStream stream, int length);

    public void onDataSent(IStream stream, int length);

    public void onSessionStalled(ISession session);

    public void onStreamStalled(IStream stream);
}
