package com.youngtvjobs.ycc.admin;

import java.util.List;

import org.springframework.stereotype.Service;

public interface AdminService {
	
	AdminDto select() throws Exception;
	AdminDto joinTermsUpdate() throws Exception;

}
