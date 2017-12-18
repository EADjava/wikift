/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wikift.support.service.article;

import com.wikift.model.article.ArticleEntity;
import com.wikift.support.repository.article.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "articleService")
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public ArticleEntity save(ArticleEntity entity) {
        return articleRepository.save(entity);
    }

    @Override
    public ArticleEntity update(ArticleEntity entity) {
        return articleRepository.save(entity);
    }

    @Override
    public Page<ArticleEntity> findAll(Pageable pageable) {
        return (Page<ArticleEntity>) articleRepository.findAll(pageable);
    }

    @Override
    public ArticleEntity info(Long id) {
        return articleRepository.findOne(id);
    }

    @Override
    public Long delete(Long id) {
        articleRepository.delete(id);
        return id;
    }

    @Override
    public List<ArticleEntity> findTopByUserEntityAndCreateTime(String username) {
        return articleRepository.findTopByUserEntityAndCreateTime(username);
    }

}
