// Copyright (c) 2013, Cloudera, inc.
// Confidential Cloudera Information: Covered by NDA.
package org.kududb.client;

import kudu.master.Master;
import kudu.rpc.RpcHeader;

/**
 * This exception is thrown when a Master responds to an RPC with an error message
 */
@SuppressWarnings("serial")
public class MasterErrorException extends KuduServerException {

  MasterErrorException(RpcHeader.ErrorStatusPB errorStatus) {
    super(errorStatus);
  }

  MasterErrorException(Master.MasterErrorPB error) {
    super(error.getStatus());
  }
}